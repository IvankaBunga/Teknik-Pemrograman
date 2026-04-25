package com.p2p.service;
import com.p2p.domain.*;
import java.math.BigDecimal;

public class LoanService {

    public Loan createLoan(Borrower borrower, BigDecimal amount) {
        // Validasi (delegasi ke domain)
        // validasi orang yang meminjam
        validateBorrower(borrower);
        // validasi uang
        validateAmount(amount);

        // create loan (domain object)
        Loan loan = new Loan();

        // memanggil program berdasarkan skor peminjam
        loan.evaluateStatus(borrower.getCreditScore());

        return loan;
    }

    // private validation method
    private void validateBorrower(Borrower borrower) {
        if (!borrower.canApplyLoan()) {
            throw new IllegalArgumentException("Borrower not verified");
        }
    }

    // menambah validasi dari implementasi TC-02 (memeriksa nominal uang)
    private void validateAmount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }
}
