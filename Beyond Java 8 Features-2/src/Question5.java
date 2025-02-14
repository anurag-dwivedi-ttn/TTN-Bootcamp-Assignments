// Q5)- Mark Child classes as final, sealed, and non sealed and observe their behavior

sealed class Animal permits Dog, Cat, Bird {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
final class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
sealed class Cat extends Animal permits PersianCat {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
non-sealed class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}
final class PersianCat extends Cat {
    @Override
    public void makeSound() {
        System.out.println("Persian Cat purrs");
    }
}
public class Question5 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();
        Animal persianCat = new PersianCat();

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
        persianCat.makeSound();
    }
}
// Explanation-
/*In this code Animal is a sealed class allowing only Dog, Cat, and Bird to extend it.
The Dog class is final meaning no further subclasses can extend it.
The Cat class is also sealed, but it allows only PersianCat to extend it.
Bird, on the other hand is non-sealed meaning it can be extended by any class.
Each subclass overrides the makeSound() method to provide a unique implementation. */

