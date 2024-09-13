//Write a Java program that creates a `TreeSet` of doubles with the values {1.1, 2.2, 3.3, 4.4, 5.5}.
    // Use the `first()`, `last()`, `higher()`, and `lower()` methods to retrieve and print the
    // first element, last element, the smallest element strictly greater than 3.3, and the largest element strictly less than 3.3.
package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMethods {
    
    public static void main(String[] args) {
        TreeSet<Double> sc=new TreeSet<>(Set.of(1.1, 2.2, 3.3, 4.4, 5.5));
        System.out.println("Using first(): "+sc.first());
        System.out.println("Using last(): "+sc.last());
        System.out.println("Using higher(): "+sc.higher(3.3));
        System.out.println("Using lower(): "+sc.lower(3.3));
    }
}
