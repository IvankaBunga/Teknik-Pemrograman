package id.ac.polban.employee.service;

import id.ac.polban.employee.model.*;
import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
    private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
    }

    public void raiseSalary(int id, double percent) {
        Employee emp = employees.get(id);
        if (emp != null) {
            // Rumus kenaikan gaji menggunakan LaTeX
            // $$salary_{new} = salary_{old} \times (1 + \frac{percent}{100})$$
            double newSalary = emp.getSalary() * (1 + percent / 100);
            emp.setSalary(newSalary);
        }
    }
}
