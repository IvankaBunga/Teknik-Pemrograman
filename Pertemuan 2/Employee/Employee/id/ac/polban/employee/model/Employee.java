package id.ac.polban.employee.model;

public class Employee {
    // 1. Data Karyawan (Private biar aman)
    private int id;
    private String name;
    private Department department; // Relasi Aggregation
    private EmploymentType type;
    private double salary;

    // 2. Penghitung Karyawan (Static)
    private static int totalEmployee = 0;

    // 3. Constructor (Dijalankan saat 'new Employee')
    public Employee(int id, String name, Department dept, EmploymentType type, double salary) {
        this.id = id;
        this.name = name;
        this.department = dept;
        this.type = type;
        this.salary = salary;

        // Tiap ada objek baru, angka ini naik
        totalEmployee++;
    }

    // 4. Method Static untuk ambil total
    public static int getTotalEmployee() {
        return totalEmployee;
    }

    // 5. Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department dept) { this.department = dept; }

    public EmploymentType getType() { return type; }
    public void setType(EmploymentType type) { this.type = type; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}
