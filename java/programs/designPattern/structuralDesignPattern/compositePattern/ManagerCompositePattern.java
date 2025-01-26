package java.designPattern.structuralDesignPattern.compositePattern;

import java.util.ArrayList;
import java.util.List;

//public class CompositePattern {
interface Employee {
    void showEmployeeDetails();
}

class Developer implements Employee {
    private final String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Developer: " + name);
    }
}

public class ManagerCompositePattern implements Employee {
    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployeeDetails() {
        for (Employee employee : employees) {
            employee.showEmployeeDetails();
        }
    }
}
