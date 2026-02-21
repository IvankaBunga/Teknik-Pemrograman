public class Restaurant {
    private MenuMakanan[] daftarMenu;
    private static byte id = 0;

    public Restaurant() {
        // Mengelola array yang isinya adalah OBJEK Makanan
        daftarMenu = new MenuMakanan[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (id < daftarMenu.length) {
            daftarMenu[id] = new MenuMakanan(nama, harga, stok);
            id++;
        }
    }

    public void tampilMenuMakanan() {
        System.out.println("=== DAFTAR MENU ===");
        for (int i = 0; i < id; i++) {
            System.out.println(daftarMenu[i].getNama() + " [" + daftarMenu[i].getStok() + "]\tRp. " + daftarMenu[i].getHarga());
        }
    }

    // FITUR PEMESANAN dipindah
    public void pesanMenu(String nama, int jumlah) {
        for (int i = 0; i < id; i++) {
            if (daftarMenu[i].getNama().equalsIgnoreCase(nama)) {
                if (daftarMenu[i].kurangiStok(jumlah)) {
                    System.out.println("Berhasil memesan " + jumlah + " " + nama);
                } else {
                    System.out.println("Gagal! Stok " + nama + " tidak cukup.");
                }
                return;
            }
        }
        System.out.println("Menu tidak ditemukan!");
    }
}
