//Q3)- Use equal and hashCode methods with Student records

record Student1(int id, String name, String standard) {}

public class Question3 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Anurag", "12th");
        Student student2 = new Student(2, "Raj", "10th");
        Student student3 = new Student(1, "Anurag", "12th");

        // equals() method example
        System.out.println(student1.equals(student3)); // true
        System.out.println(student1.equals(student2)); // false

        // hashCode() method example
        System.out.println(student1.hashCode());
        System.out.println(student3.hashCode()); // Same as student1
    }
}

/*Explanation-The record automatically generates equals() and hashCode(), making object comparisons straightforward.
In the main method, multiple Student objects are created and compared using equals()
demonstrating how two students with the same values are considered equal while hashCode() ensures consistent hashing*/


