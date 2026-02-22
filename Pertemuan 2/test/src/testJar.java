import id.ac.polban.employee.model.*; // Mengambil model dari JAR
import id.ac.polban.employee.service.*; // Mengambil service dari JAR

public class testJar {
    public static void main(String[] args) {
        // Membuat data menggunakan class dari JAR
        Department dept = new Department("Human Resources");
        EmploymentType type = new EmploymentType("Tetap");
        Employee emp = new Employee(101, "Zaki", dept, type, 7500000);

        // tes apakah static counter bekerja
        System.out.println("Karyawan baru: " + emp.getName());
        System.out.println("Total Karyawan (dari JAR): " + Employee.getTotalEmployee());

        // tes service dari JAR
        EmployeeService service = new EmployeeService();
        service.addEmployee(emp);
        service.raiseSalary(101, 10); // Naik 10%
        System.out.println("Gaji setelah naik 10%: Rp" + emp.getSalary());
    }
}
