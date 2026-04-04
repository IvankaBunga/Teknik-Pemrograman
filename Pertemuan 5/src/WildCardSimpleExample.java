import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class WildCardSimpleExample {

    // Wildcard <?> berarti "tipe apa saja yang tidak diketahui"
    // Ini lebih fleksibel daripada <T> karena kita tidak perlu mendeklarasikan tipe di nama method
    public static void printCollection(Collection<?> c) {
        // Karena tipenya tidak diketahui (?), Java memperlakukan isinya sebagai Object
        for (Object e : c) {
            System.out.println(e); // Mencetak elemen apa pun yang ada di dalam koleksi
        }
    }

    public static void main(String[] args) {
        // Membuat koleksi String menggunakan ArrayList
        Collection<String> collection = new ArrayList<>();
        collection.add("ArrayList Collection");
        // Method printCollection bisa menerima Collection<String> karena String adalah "tipe apa saja"
        printCollection(collection);

        // Membuat koleksi String menggunakan LinkedList
        Collection<String> collection2 = new LinkedList<>();
        collection2.add("LinkedList Collection");
        printCollection(collection2);

        // Membuat koleksi String menggunakan HashSet
        Collection<String> collection3 = new HashSet<>();
        collection3.add("HashSet Collection");
        printCollection(collection3);

        /* * Catatan: Jika kita membuat Collection<Integer>, method printCollection
         * tetap akan bekerja karena simbol <?> menerima semua jenis tipe data.
         */
    }
}