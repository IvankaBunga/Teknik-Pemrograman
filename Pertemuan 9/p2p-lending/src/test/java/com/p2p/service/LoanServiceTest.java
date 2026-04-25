package com.p2p.service;
import com.p2p.domain.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

public class LoanServiceTest {
    @Test
    void shouldRejectLoanWhenBorrowerNotVerified() {

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
    }

    @Test
    void shouldRejectLoanWhenAmountIsZeroOrNegative() {
        LoanService service = new LoanService();
        Borrower b = new Borrower(true, 700); // Borrower valid

        // Skenario: Pinjaman Rp 0
        BigDecimal zeroAmount = BigDecimal.ZERO;

        // kita berekspektasi sistem melempar exception
        assertThrows(IllegalArgumentException.class, () -> {
            service.createLoan(b, zeroAmount);
        });
    }

    @Test
    void shouldApprovedLoanWhenCreditScoreHigh() {
        LoanService service = new LoanService();
        Borrower b = new Borrower(true, 700);

        // skenario: jumlah uang yang ingin dipinjam = 5000
        BigDecimal amount = BigDecimal.valueOf(5000);

        // hasil apakah peminjam approved atau rejected
        Loan result = service.createLoan(b, amount);

        // kita berekspektasi statusnya APPROVED karena credit scorenya tinggi
        assertEquals(Loan.Status.APPROVED, result.getStatus());
    }

    @Test
    void shouldRejectLoanWhenCreditScoreLow() {
        LoanService service = new LoanService();
        // Borrower verified tapi credit score rendah (500 < 600)
        Borrower b = new Borrower(true, 500);

        // skenario: jumlah uang yang ingin dipinjam = 2000
        BigDecimal amount = BigDecimal.valueOf(2000);

        // hasil apakah peminjam approved atau rejected
        Loan result = service.createLoan(b, amount);

        // kita berekspektasi statusnya REJECTED karena credit scorenya rendah
        assertEquals(Loan.Status.REJECTED, result.getStatus());
    }
}

// assertThrows = test program apakah akan error jika dikasih data yang salah
// assertEquals = test program apakah akan benar jika dikasih data yang benar