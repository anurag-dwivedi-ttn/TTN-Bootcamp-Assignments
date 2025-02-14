//Q1)- Create a Record for the Student with the following Fields: id name standard
//Q2)- Make sure that no null values should be used for initialization.

import java.util.Objects;
record Student(int id, String name, String standard) {
    // Compact constructor to prevent null values
    public Student {
        Objects.requireNonNull(name, "Name cannot be null");
        Objects.requireNonNull(standard, "Standard cannot be null");
    }
}
public class Question1_2 {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "Anurag", "Final Year");
            System.out.println("Student 1 created: " + student1);
        } catch (NullPointerException e) {
            System.out.println("Error creating student1: " + e.getMessage());
        }

        try {
            Student student2 = new Student(2, "Rohit", "Final Year");
            System.out.println("Student 2 created: " + student2);
        } catch (NullPointerException e) {
            System.out.println("Error creating student2: " + e.getMessage());
        }

        try {
            Student student3 = new Student(3, "Anurag", null);
            System.out.println("Student 3 created: " + student3);
        } catch (NullPointerException e) {
            System.out.println("Error creating student3: " + e.getMessage());
        }

    }
}
/*Explanation- This Java program defines a Student record with fields id, name, and standard,
ensuring immutability and concise code.
 A custom constructor uses Objects.requireNonNull() to prevent null values for name and standard.
 And for handling NULL Value exception I am using try catch blocks as shown in the above code.
 */


