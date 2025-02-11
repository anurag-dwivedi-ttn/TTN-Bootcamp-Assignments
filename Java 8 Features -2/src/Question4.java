// Q4- Write a program to showcase the use of optional class

import java.util.*;
public class Question4{
    public static void main(String[] args) {
        // Example 1: Value is present
        String name = getUserName(true);  //  getting a user name
        Optional<String> optionalName = Optional.ofNullable(name);

        // Using Optional to handle the value
        System.out.println("User Name: " + optionalName.orElse("Default User"));

        // Example 2: Value is null (user not found)
        String name2 = getUserName(false);  //  user not found
        Optional<String> optionalName2 = Optional.ofNullable(name2);

        // Using Optional.orElse to provide a default value if null
        System.out.println("User Name: " + optionalName2.orElse("Guest User"));
    }

    // Simulates fetching a user name (might return null)
    public static String getUserName(boolean userExists) {
        return userExists ? "Anurag" : null;
    }
}

// Basically optional class is used to avoid the null value exception by providing some common operations on optional stream
// value.get()
// value.orElse(other)
// value.orElseGet(Supplier)
// value.isPresent()