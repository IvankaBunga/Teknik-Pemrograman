package JavaProblems;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter untuk Nama
    public String getName() {
        return name;
    }

    // Getter untuk Gaji
    public int getSalary() {
        return salary;
    }

    // Mengubah objek menjadi teks saat diprint
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}