public class Commission extends Hourly {
    // Variabel instansi tambahan untuk total penjualan dan rate komisi [cite: 13]
    private double totalSales;
    private double commissionRate;

    // Constructor dengan 6 parameter [cite: 14]
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commRate) {
        // Memanggil constructor induk (Hourly) dengan 5 parameter pertama [cite: 15]
        super(eName, eAddress, ePhone, socSecNumber, rate);

        // Mengatur rate komisi (dalam bentuk desimal, misal 0.2 untuk 20%) [cite: 13, 15]
        commissionRate = commRate;
        totalSales = 0;
    }

    // Method untuk menambahkan angka penjualan [cite: 16]
    public void addSales(double sales) {
        totalSales += sales;
    }

    // Method pay yang bersifat polimorfik [cite: 17]
    @Override
    public double pay() {
        // Menghitung gaji pokok dari jam kerja dengan memanggil method pay milik Hourly [cite: 17]
        double payment = super.pay();

        // Menambahkan komisi dari penjualan ke total gaji [cite: 17]
        payment += (totalSales * commissionRate);

        // Reset total penjualan kembali ke 0 [cite: 18]
        // Catatan: hoursWorked tidak perlu direset manual karena sudah dilakukan di super.pay() [cite: 18, 291]
        totalSales = 0;

        return payment;
    }

    // Mengembalikan informasi karyawan dalam bentuk String [cite: 19]
    @Override
    public String toString() {
        // Menggabungkan toString milik induk dengan informasi total penjualan [cite: 19]
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}