package JavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemTwo {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(101, "Joe"),
                new Student(103, "Zulkifli"),
                new Student(102, "Riza"),
                new Student(104, "Alice"),
                new Student(105, "Joshua")
        );

        List<Student> ans = students.stream() // [1] Membuka stream
                .sorted((s1, s2) -> {       // [2] Melakukan pengurutan dengan lambda

                    // Logika: Jika nama sama, bandingkan ID
                    if (s1.getName().equalsIgnoreCase(s2.getName())) {
                        // [3] Integer.compare mengembalikan -1, 0, atau 1
                        return Integer.compare(s1.getId(), s2.getId());
                    }
                    // Jika nama berbeda, bandingkan Nama secara alfabetis (A-Z)
                    else {
                        // [4] Membandingkan String tanpa melihat huruf kapital
                        return s1.getName().compareToIgnoreCase(s2.getName());
                    }
                })
                .collect(Collectors.toList()); // [5] Mengumpulkan hasil akhir

        // Cetak hasil
        for (Student student : ans) {
            System.out.println(student);
        }
    }
}