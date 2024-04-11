package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // String list[]={"tomato","onion","potato","garlic","potato","ginger","onion"};

        // ArrayList
        List<String> list1 = new ArrayList<>();
        list1.add("Tomato");
        list1.add("Onion");
        list1.add("Potato");
        list1.add("Garlic");
        list1.add("Potato");
        list1.add("Ginger");
        list1.add("Onion");
        System.out.print("\nArrayList: " + list1 + "\n");
        // System.out.println("Search: "+ list1.get(2));

        // LinkedList
        List<String> list2 = new LinkedList<>(list1);
        list2.add(2, "Tomato");
        list2.remove(0);
        System.out.print("\nLinkedList: " + list2 + "\n");

        // TreeSet
        Set<String> list3 = new TreeSet<>(list2);
        System.out.print("\nTreeSet: " + list3 + "\n");

        // HashSet
        Set<String> list4 = new HashSet<>(list2);
        System.out.print("\nHashSet: " + list4 + "\n");

        // LinkedHasSet
        Set<String> list5 = new LinkedHashSet<>(list2);
        System.out.print("\nLinkedHashSet: " + list5 + "\n");

    }
}
