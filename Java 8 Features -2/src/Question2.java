// Q2- Create and access default and static method of an interface.

interface Question2 {
    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
class MyClass implements Question2{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.defaultMethod(); // Accessing default method
        Question2.staticMethod(); // Accessing static method (We can access the static methods by the class/Interface name only because static methods are bound to the class not to objects)
    }
}

//Note- Onwards Java 8 we can also put default and static methods inside the interface along with the abstract methods


