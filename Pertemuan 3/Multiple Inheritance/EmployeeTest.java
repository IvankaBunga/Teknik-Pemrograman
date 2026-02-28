public class EmployeeTest {
    public static void main(String[] args) {
        // Mendeklarasikan dan mengalokasikan array untuk 3 objek Employee
        Employee[] staff = new Employee[3];

        // Inisialisasi data karyawan
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // --- UJI COBA METODE COMPARE (Instruksi A) ---
        System.out.println("========== HASIL COMPARE ==========");

        // Membandingkan Antonio (staff[0]) dengan Maria (staff[1])
        int hasil = staff[0].compare(staff[1]);

        System.out.println("Bandingkan staff[0] dengan staff[1]: " + hasil);

        if (hasil < 0) {
            System.out.println("Hasil: Gaji Antonio lebih kecil dari Maria");
        } else if (hasil > 0) {
            System.out.println("Hasil: Gaji Antonio lebih besar dari Maria");
        } else {
            System.out.println("Hasil: Gaji mereka sama");
        }

        System.out.println("\n========== DATA KARYAWAN ==========");
        // Menaikkan gaji setiap staf sebesar 5%
        for (int i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
            staff[i].print();
        }
    }
}
