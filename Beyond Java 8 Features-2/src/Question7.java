// Q7)-Q7)Demonstrate the use of firstEntry(), lastEntry(), pollFirstEntry(),
// pollLastEntry(), putFirst(), putLast(), reversed() with SequencedMap.

import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>();
        map.put(2, "B");
        map.put(3, "C");
        map.putFirst(1, "A");
        map.putLast(4, "D");
        System.out.println("Map after insertions: " + map);
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        System.out.println("\nPolling first and last entries...");
        System.out.println("Removed First Entry: " + map.pollFirstEntry());
        System.out.println("Removed Last Entry: " + map.pollLastEntry());

        System.out.println("\nMap after polling: " + map);
        System.out.println("Reversed Map: " + map.reversed());
    }
}
// Explanation-
/*
In this code a SequencedMap is demonstrated using LinkedHashMap.
The putFirst() and putLast() methods insert elements at the beginning and end of the map respectively.
The firstEntry() and lastEntry() methods retrieve the first and last entries without removing them.
The pollFirstEntry() and pollLastEntry() methods remove and return the first and last entries.
reversed() creates a reversed order view of the map.
The program shows how elements are inserted, retrieved, removed, and reversed while maintaining the insertion order.*/
