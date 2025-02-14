/*Q4)- Use a Sealed class Class concept to create a class hierarchy*/

sealed class Shape permits Circle, Rectangle {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

final class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

final class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Question4 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();
    }
}
// Explanation-
/*
In this code, the Shape class is sealed, meaning only the specified classes (Circle and Rectangle) are allowed to extend it.
This prevents any other classes from inheriting Shape, ensuring strict control over its hierarchy.
Both Circle and Rectangle are final, meaning they cannot be further extended.
Each subclass overrides the draw() method to provide its own implementation.*/
