package id.ac.polban.employee;

// Mengambil semua isi dari package model dan service
import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class EmployeeMain {
    public static void main(String[] args) {
        // 1. Membuat Departemen dan Tipe
        Department deptIT = new Department("IT Support");
        EmploymentType permanent = new EmploymentType("Tetap");

        // 2. Menambahkan Karyawan
        Employee emp1 = new Employee(1, "Budi", deptIT, permanent, 5000000);
        Employee emp2 = new Employee(2, "Susi", deptIT, permanent, 6000000);

        // 3. Menampilkan jumlah karyawan
        System.out.println("Total Karyawan Saat Ini: " + Employee.getTotalEmployee());

        // 4. Menggunakan Service untuk menaikkan gaji
        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);

        System.out.println("Gaji Budi sebelum naik: Rp" + emp1.getSalary());
        service.raiseSalary(1, 15); // Naik 15%
        System.out.println("Gaji Budi setelah naik: Rp" + emp1.getSalary());
    }
}
