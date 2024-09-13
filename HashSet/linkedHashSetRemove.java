 // Write a Java program that creates a `LinkedHashSet` of characters with the values {'A', 'B', 'C', 'D', 'E'}.
    // Remove the character 'C' from the set. Check if 'C' is still in the set and print the resulting set.
package HashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetRemove {
   
    public static void main(String[] args) {
        LinkedHashSet<Character> values=new LinkedHashSet<>();
        for(char a='A';a<='E';a++)
            values.add(a);

        //Removing 'C'
        values.remove('C');

        System.out.println("If 'C' is there? "+values.contains('C'));
        System.out.println("LinkedHashSet : "+values);
    }
}
