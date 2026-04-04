public class GenericsTypeOld {
    private Object t; // dibikin object karena tipe data t tidak diketahui (bebas bisa apa saja)

    // getter
    // untuk mengambil kembali nilai yang sudah disimpan
    public Object get() {
        return t;
    }

    // setter
    // untuk memasukkan nilai ke dalam variable t
    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]) {
        GenericsTypeOld type = new GenericsTypeOld();
        type.set("Java");
        // melakukan konversi ke string secara paksa karena get() mengembalikan object
        // dan tidak bisa menyimpannya langsung ke tipe data string
        String str = (String) type.get(); // type casting, error prone and can cause ClassCastException
        // jika suatu saat type.set diisi dengan integer dan konversi tetap ke String
        // program akan crash saat running
    }

}
