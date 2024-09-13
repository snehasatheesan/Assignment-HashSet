//Write a Java program that creates a `TreeSet` of integers.
    // Add the numbers 50, 30, 20, 10, and 40 to the set. Print all elements in the set and observe the order.
package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasic {
    public static void main(String[] args) {
        TreeSet<Integer> tc=new TreeSet<>();
        tc.add(50);
        tc.add(30);
        tc.add(20);
        tc.add(10);
        tc.add(40);

        System.out.println(tc);
        System.out.println("Using the iterator: ");
        Iterator<Integer> sc=tc.iterator();
        while (sc.hasNext())
            System.out.print(sc.next()+" ");
    }
}
