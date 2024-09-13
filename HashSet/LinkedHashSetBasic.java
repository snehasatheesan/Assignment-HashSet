// Write a Java program that creates a `LinkedHashSet` of integers. Add the numbers 5, 10, 15, 20, and 25 to the set.
    // Attempt to add the number 15 again. Print all elements in the set and observe the order and duplicates.
package HashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetBasic {
    
    public static void main(String[] args) {
        LinkedHashSet<Integer> values=new LinkedHashSet<>();
        values.add(5);
        values.add(10);
        values.add(15);
        values.add(20);
        values.add(25);

        //Trying to add the number 15 again
        values.add(15);

        System.out.println(values);
    }
}
