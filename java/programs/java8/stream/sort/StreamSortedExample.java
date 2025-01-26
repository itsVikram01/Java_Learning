package programs.java8.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.lang.System.out;

public class StreamSortedExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice k", 50000),
                new Employee("Bob c", 65000),
                new Employee("Charlie b", 48000)
        );

        int[] arr = {1, 2, 3, 1, 4, 2, 5};
        out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
                i++;
            }
            i++;
        }
        out.println(Arrays.toString(arr));

        List<Employee> sortedBySalary = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .toList();
        out.println("Sorted by salary: " + sortedBySalary);

        // Sort by salary in descending order
        List<Employee> sortedBySalaryDescending = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .toList();
        out.println("Sorted by salary descending: " + sortedBySalaryDescending);


        // Sort by name
        List<Employee> sortedByName = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .toList();
        out.println("Sorted by name: " + sortedByName);

        // Sort by name in descending order
        List<Employee> sortedByNameDescending = employees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .toList();
        out.println("Sorted by name descending: " + sortedByNameDescending);


        // Sort by last name
        List<Employee> sortedByLastName = employees.stream()
                .sorted(Comparator.comparing(employee -> employee.getName().split(" ")[1]))
                .toList();
        out.println("Sorted by last name: " + sortedByLastName);

        // Sort by last name in descending order
        List<Employee> sortedByLastNameDescending = employees.stream()
                .sorted(Comparator.comparing(employee -> ((Employee) employee).getName().split(" ")[1]).reversed())
                .toList();
        out.println("Sorted by last name descending: " + sortedByLastNameDescending);


        // highest salary
        Optional<Employee> highestPaidEmployee = employees.stream()
                .max(Comparator.comparingInt(Employee::getSalary));
        highestPaidEmployee.ifPresent(employee -> out.println("Highest paid employee: " + highestPaidEmployee));

        // least salary
        Optional<Employee> minPaidEmployee = employees.stream()
                .min(Comparator.comparingInt(Employee::getSalary));
        highestPaidEmployee.ifPresent(employee -> out.println("Minimum paid employee: " + minPaidEmployee));

        // average salary
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary).average()
                .orElse(0.0);
        out.println("Average salary: " + averageSalary);
    }
}