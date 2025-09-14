//task 11
import java.util.List;
import java.util.ArrayList;

class Employee {
    private String name;
    private double salary;
    private List<Employee> subordinates;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee e) {
        subordinates.add(e);
    }

    public double getSalary() {
        return salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String getName() {
        return name;
    }
}

class Organization {
    public double calculateTotalSalary(Employee manager) {
        if (manager.getSubordinates().isEmpty()) {
            return manager.getSalary();
        }
        return manager.getSalary() + sumSalariesOfList(manager.getSubordinates());
    }

    private double sumSalariesOfList(List<Employee> employees) {
        //Call your main calculateTotalSalary function on this first employee to get their total salary.
        double firstSalary = calculateTotalSalary(employees.getFirst());
        if (employees.isEmpty()) {
            return 0;
        }
        // Recursive case: sum of first salary + sum of the rest
        List<Employee> rest = employees.subList(1, employees.size());

        return calculateTotalSalary(employees.get(0)) + sumSalariesOfList(rest);
    }

}