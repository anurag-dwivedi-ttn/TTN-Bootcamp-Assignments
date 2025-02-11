//Q1- Implement following functional interfaces from java.util.function using lambdas: 1. Consumer 2. Supplier 3. Predicate 4. Function

import java.util.function.*;
public class Question1 {
    public static void main(String[] args) {

            // 1. Consumer - Basically Consumer is a Functional Interface and it contains the only abstract method accept and when .accept() is called it executes the lambda and prints the message.
            Consumer<String> consumer = msg -> System.out.println("Consumer received: " + msg);
            consumer.accept("Hello Everyone");

            // 2. Supplier - Supplier is also a Functional Iterface and it contains the only abstract method get and when.get() is called it executes the lambda and returns a value. In this case a random number.
            Supplier<Double> supplier = () -> Math.random();
            System.out.println("Supplier generated: " + supplier.get());

            // 3. Predicate - Predicate is also a Functional Interface and it contains the only abstract method test and when .test() is called it executes the lambda and returns a value.
            Predicate<Integer> predicate = num -> num % 2 == 0;
            System.out.println("Predicate test (10 is even?): " + predicate.test(10));

            // 4. Function - Function is also a Function Interface and it contains the only abstract method apply and when .apply() is called it executes the lambda and converts a String to its length.
            Function<String, Integer> function = str -> str.length();
            System.out.println("Function result (Length of 'Hello'): " + function.apply("Hello"));
        }
    }


