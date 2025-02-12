// Q1)-Use iterator stream method to generate a stream

import java.util.stream.Stream;
public class Question1 {
    public static void main(String[] args) {
        Stream<Integer> s=Stream.iterate(0, i->i<=10, i->i+2);
        s.forEach(System.out::println);
    }
}

//Explanation-
/*
Here I am using Stream.iterate method to generate a stream which is get stored as streams of integer in s.
Then by iterating over each stream element using forEach loop we are printing the integer using method referencing.
*/
