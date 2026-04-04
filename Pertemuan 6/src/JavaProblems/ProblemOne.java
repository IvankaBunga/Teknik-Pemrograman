package JavaProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemOne {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("John", 50000));
        list.add(new Employee("Rob", 70000));
        list.add(new Employee("Bob", 40000));
        list.add(new Employee("Alice", 10000));

        // Proses pengolahan data menggunakan Stream API
        List<Employee> sortedEmp = list.stream() // [1] Mengubah ArrayList menjadi Stream

                // [2] sorted() menerima lambda (e1, e2) untuk membandingkan dua objek
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName())) // [3] Membandingkan getName()

                // [4] collect() adalah terminal operation untuk membungkus hasil
                .collect(Collectors.toList()); // [5] Menggunakan utility Collectors

        // Menampilkan hasil setelah diurutkan
        for(Employee e : sortedEmp){
            System.out.println(e);
        }
    }
}