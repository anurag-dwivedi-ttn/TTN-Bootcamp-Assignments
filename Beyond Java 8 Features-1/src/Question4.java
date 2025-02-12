//Q4)-Create Unmodifiable List from a Stream

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question4 {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(list);
        list.add(6); // Throws UnsupportedOperationException
        }
    }

    // Explanaion-
    /*

     Here I am using a Stream to generate a list of elements
     and Collectors.toUnmodifiableList() ensures that the list cannot be modified after creation.
     This prevents accidental changes and makes the list immutable.

    */
