package com.p2p.domain;

public class Loan {
    // Enum untuk status loan
    public enum Status {
        PENDING, APPROVED, REJECTED
    }

    private Status status;

    // Saat loan dibuat, status awal adalah PENDING
    public Loan() {
        this.status = Status.PENDING;
    }

    // Setter untuk mengubah status loan
    public void setStatus(Status status) {
        this.status = status;
    }

    // Getter untuk membaca status loan
    public Status getStatus() {
        return status;
    }

    // DOMAIN BEHAVIOR
    public void approve() {
        this.status = Status.APPROVED;
    }
    public void reject() {
        this.status = Status.REJECTED;
    }

    // logika untuk "siapa yang berhak untuk di-approved" ke object Loan
    public void evaluateStatus(int creditScore){
        // jika skor >= 600 maka akan disetujui, jika tida akan ditolak
        if (creditScore >= 600) {
            this.status = Status.APPROVED;
        } else {
            this.status = Status.REJECTED;
        }
    }
}
