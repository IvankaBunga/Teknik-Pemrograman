package JavaProblems;

import java.util.Arrays;

public class ProblemThree {
    public static void main(String[] args) {
        int arr[] = {12, 4, 3, 1, 9, 657};
        int n = 3; // Mencari elemen terbesar ke-3

        // Proses pengolahan data
        int ans = Arrays.stream(arr) // [1] Mengubah array menjadi IntStream
                .boxed()             // [2] Mengubah int ke Integer (Boxing)

                // Mengurutkan dari yang terbesar ke terkecil (Descending)
                .sorted((a, b) -> Integer.compare(b, a))

                .skip(n - 1)         // [3] Lewati 2 elemen pertama (Terbesar 1 & 2)

                .findFirst()         // [4] Ambil elemen pertama yang tersisa (Terbesar ke-3)

                .orElse(0);          // [5] Jika array kosong, kembalikan 0

        System.out.println("Elemen terbesar ke-" + n + " adalah: " + ans);
    }
}