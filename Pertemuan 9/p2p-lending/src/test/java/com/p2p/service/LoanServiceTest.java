package com.p2p.service;
import com.p2p.domain.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
// import Log4j
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoanServiceTest {
    // inisiasi logger
    private static final Logger logger = LogManager.getLogger(LoanServiceTest.class);

    @Test
    void shouldRejectLoanWhenBorrowerNotVerified() {
        // mencatat awal pengujian
        logger.info("TC-01: Memulai pengujian borrower tidak terverifikasi.");
        // =====================================================
        // SCENARIO:
        // Borrower tidak terverifikasi (KYC = false)
        // Ketika borrower mengajukan pinjaman
        // Maka sistem harus menolak dengan melempar exception
        // =====================================================

        // =========================
        // Arrange (Initial Condition)
        // =========================
        // Borrower belum lolos proses KYC
        Borrower borrower = new Borrower(false, 700);
        // Service untuk pengajuan loan
        LoanService loanService = new LoanService();

        // Jumlah pinjaman valid
        BigDecimal amount = BigDecimal.valueOf(1000);

        // =========================
        // Act (Action)
        // =========================
        // Borrower mencoba mengajukan loan
        assertThrows(IllegalArgumentException.class, () -> {
            loanService.createLoan(borrower, amount);
        });
        // asssertThrows menangkap IllegalArgumentException yang dilempar oleh createLoan

        // WARN : beri peringatan bahwa sistem berhasil menolak borrower ilegal
        logger.warn("TC-01 Selesai: Sistem berhasil memblokir peminjam non-verified.");
    }

    @Test
    void shouldRejectLoanWhenAmountIsZeroOrNegative() {
        logger.info("TC-02: Memulai pengujian validasi nominal pinjaman.");
        LoanService service = new LoanService();
        Borrower b = new Borrower(true, 700); // Borrower valid

        // Skenario: Pinjaman Rp 0
        BigDecimal zeroAmount = BigDecimal.ZERO;

        // kita berekspektasi sistem melempar exception
        assertThrows(IllegalArgumentException.class, () -> {
            service.createLoan(b, zeroAmount);
        });

        // ERROR: Menandakan ada input jumlah uang yang tidak valid tertangkap
        logger.error("TC-02 SELESAI: Input amount Rp 0 berhasil ditolak oleh sistem.");
    }

    @Test
    void shouldApprovedLoanWhenCreditScoreHigh() {
        logger.info("TC-03: Memulai pengujian skor kredit tinggi (High Score).");
        LoanService service = new LoanService();
        Borrower b = new Borrower(true, 700);

        // skenario: jumlah uang yang ingin dipinjam = 5000
        BigDecimal amount = BigDecimal.valueOf(5000);

        // hasil apakah peminjam approved atau rejected
        Loan result = service.createLoan(b, amount);

        // kita berekspektasi statusnya APPROVED karena credit scorenya tinggi
        assertEquals(Loan.Status.APPROVED, result.getStatus());

        // INFO: Mencatat keberhasilan status
        logger.info("TC-03 SELESAI: Pinjaman disetujui untuk skor: {}", b.getCreditScore());
    }

    @Test
    void shouldRejectLoanWhenCreditScoreLow() {
        logger.info("TC-04: Memulai pengujian skor kredit rendah (Low Score).");
        LoanService service = new LoanService();
        // Borrower verified tapi credit score rendah (500 < 600)
        Borrower b = new Borrower(true, 500);

        // skenario: jumlah uang yang ingin dipinjam = 2000
        BigDecimal amount = BigDecimal.valueOf(2000);

        // hasil apakah peminjam approved atau rejected
        Loan result = service.createLoan(b, amount);

        // kita berekspektasi statusnya REJECTED karena credit scorenya rendah
        assertEquals(Loan.Status.REJECTED, result.getStatus());

        // INFO: Mencatat keputusan penolakan
        logger.info("TC-04 SELESAI: Pinjaman ditolak otomatis karena skor: {}", b.getCreditScore());
    }
}

// assertThrows = test program apakah akan error jika dikasih data yang salah
// assertEquals = test program apakah akan benar jika dikasih data yang benar
/* level Log4j:
FATAL: Masalah sangat berat yang menyebabkan aplikasi mati total.
ERROR: Ada kesalahan (seperti Exception), tapi aplikasi masih berjalan.
WARN: Peringatan (sesuatu yang tidak lazim terjadi, tapi belum tentu error).
INFO: Informasi umum alur program (seperti "Memulai proses X").
DEBUG: Informasi detail untuk teknis/developer saat mencari bug.
*/