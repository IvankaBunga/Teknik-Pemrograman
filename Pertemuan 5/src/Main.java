// T extends Comparable<T> artinya tipe T dibatasi hanya untuk class yang bisa dibandingkan
interface MinMax<T extends Comparable<T>> {
    T max(); // Method abstrak untuk mencari nilai tertinggi
}

// Class MyClass mengimplementasikan interface MinMax dengan batasan tipe yang sama
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals; // Array bertipe T, akan menjadi Integer[], Character[], dll sesuai inisialisasi

    // Constructor untuk memasukkan array ke dalam variabel vals
    MyClass(T[] o) {
        vals = o;
    }

    // Implementasi method max untuk mencari nilai terbesar dalam array
    public T max() {
        T v = vals[0]; // Mengasumsikan elemen pertama sebagai nilai terbesar sementara

        for (int i = 1; i < vals.length; i++) {
            // Menggunakan compareTo (bukan >) karena T adalah objek, bukan tipe primitif
            // Jika hasil > 0, artinya vals[i] lebih besar dari v
            if (vals[i].compareTo(v) > 0) {
                v = vals[i]; // Update nilai terbesar
            }
        }
        return v; // Mengembalikan hasil akhir tanpa perlu type casting manual
    }
}

public class Main {
    public static void main(String[] args) {
        // Inisialisasi array dengan tipe pembungkus (Wrapper Class)
        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        // Membuat objek khusus untuk Integer (Type Safety terjamin)
        MyClass<Integer> a = new MyClass<>(inums);

        // Membuat objek khusus untuk Character (Type Safety terjamin)
        MyClass<Character> b = new MyClass<>(chs);

        // Mencetak hasil, Java otomatis tahu tipe datanya tanpa konversi paksa
        System.out.println("Nilai Integer Terbesar: " + a.max());
        System.out.println("Karakter Terbesar: " + b.max());
    }
}