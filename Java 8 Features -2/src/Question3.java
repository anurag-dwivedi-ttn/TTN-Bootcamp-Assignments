// Q3- Sum all the numbers greater than 5 in the integer list using streams

import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        int sum = List.of(1, 6, 3, 8, 4, 10).stream() // It converts the upcoming list into a stream
                .filter(n -> n > 5)  // It basically filter the elements in the stream which are >5 and returns the stream
                .mapToInt(Integer::intValue) // The mapToInt function converts the Stream<Integer> to an IntStream (a primitive int stream).
                .sum(); // It computes the sum of the filtered numbers.
        System.out.println(sum);
    }
}
