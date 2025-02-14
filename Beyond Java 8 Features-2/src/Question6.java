//Q6)- Demonstrate the use of addFirst(), addLast, removeFirst(), removeLast, getFirst(), getLast(), reversed()
// in Set and List Sequenced collections

import java.util.*;

public class Question6{
    public static void main(String[] args) {

        SequencedCollection<Integer> list = new LinkedList<>();
        list.addFirst(10); // add at first position from left
        list.addLast(20); // add at last position from right
        list.addLast(30);

        System.out.println("List after additions: " + list);
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println("List after removals: " + list);
        System.out.println("Reversed List: " + list.reversed());

        SequencedSet<String> set = new LinkedHashSet<>();
        set.addFirst("A");
        set.addLast("B");
        set.addLast("C");

        System.out.println("Set after additions: " + set);
        System.out.println("First Element: " + set.getFirst());
        System.out.println("Last Element: " + set.getLast());

        set.removeFirst();
        set.removeLast();
        System.out.println("Set after removals: " + set);
        System.out.println("Reversed Set: " + set.reversed());
    }
}
