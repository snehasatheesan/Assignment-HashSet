package HashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetConversion {
    public static void main(String[] args) {
        LinkedHashSet<String> colour = new LinkedHashSet<>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("yellow");
        String[] colorArray = colour.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(colorArray));

        LinkedHashSet<String> newColor = new LinkedHashSet<>(Arrays.asList(colorArray));

        System.out.println("LinkedHashSet: " + newColor);
    }
}
