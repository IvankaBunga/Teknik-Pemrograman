public class MenuMakanan {
    private String nama;
    private double harga;
    private int stok;

    public MenuMakanan(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.setStok(stok);
    }

    // Getter dan Setter
    public String getNama() {return nama;}
    public double getHarga() {return harga;}
    public int getStok() {return stok;}

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh negatif!");
        }
    }

    // Method untuk mengurangi stok saat dipesan
    public boolean kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
            return true; // Berhasil dikurangi
        }
        return false; // Gagal karena stok kurang
    }
}

