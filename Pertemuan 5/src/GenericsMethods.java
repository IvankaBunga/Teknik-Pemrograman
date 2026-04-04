public class GenericsMethods {

    // <T> sebelum tipe return (boolean) menandakan bahwa ini adalah Generic Method
    // Method ini menerima dua parameter yang keduanya harus memiliki tipe T yang sama
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
        // Mengambil isi objek dan membandingkannya menggunakan equals()
        // Karena menggunakan Generics, Java menjamin g1 dan g2 berisi tipe data yang setipe
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]) {
        // Membuat objek GenericsType khusus untuk String
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Java");

        // Membuat objek GenericsType kedua khusus untuk String
        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Java");

        // Cara formal: Menentukan tipe secara eksplisit dengan <String> sebelum nama method
        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);

        // Cara praktis: Type Inference (Penyimpulan Tipe)
        // Java cukup pintar untuk melihat bahwa g1 dan g2 adalah String,
        // sehingga kita tidak perlu lagi menuliskan <String> secara manual
        isEqual = GenericsMethods.isEqual(g1, g2);

        // Compiler otomatis menyimpulkan (infer) tipe data yang dibutuhkan berdasarkan argumen
    }
}