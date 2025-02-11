// Q5- Given a list of objects of following class:
// class Employee{ String fullName; Long salary; String city; } Get
// list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
// Note: Full name is concatenation of first name, middle name and last name with single space in between.

import java.util.*;
import java.util.stream.*;

class Employee {
    String fullName;
    int salary;
    String city;

    // This is a parameterized constructor of Employee class
    Employee(String fullName, int salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    // Method to extract the first name
    String getFirstName() {
        return fullName.split(" ")[0]; // it returns the first word from full name
    }
}

public class Question5 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Anurag Kumar Dwivedi", 9000, "Delhi"),
                new Employee("Rohit Kumar Upadhyay", 6000, "Mumbai"),
                new Employee("Sita Kumari Sharma", 4500, "Delhi"),
                new Employee("Rohit Kumar Singh", 3000, "Delhi"),
                new Employee("Anurag Kumar Gupta", 4000, "Delhi") // Same first name, different last name
        );

        // Get unique first names of employees meeting the criteria
        Set<String> uniqueFirstNames = employees.stream()
                .filter(e -> e.salary < 5000 && "Delhi".equals(e.city)) // Salary < 5000 and city = Delhi
                .map(Employee::getFirstName) // Extract first name
                .collect(Collectors.toSet()); // Collect unique names

        // Print result
        System.out.println(uniqueFirstNames);
    }
}
