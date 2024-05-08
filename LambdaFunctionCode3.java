package Railworld_India_PVT_Task;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaFunctionCode3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        // Sorting using lambda expression
        Collections.sort(names, (a, b) -> a.compareTo(b));

        // Printing the sorted list
        System.out.println("Sorted names: " + names);

        // Another example using lambda expression
        MyFunctionalInterface myLambda = (x, y) -> {
            if (x > y)
                return "x is greater than y";
            else if (x < y)
                return "x is less than y";
            else
                return "x is equal to y";
        };

        // Using the lambda expression
        System.out.println(myLambda.compare(5, 3)); // Output: x is greater than y
        System.out.println(myLambda.compare(3, 5)); // Output: x is less than y
        System.out.println(myLambda.compare(5, 5)); // Output: x is equal to y
    }

    // Functional interface
    interface MyFunctionalInterface {
        String compare(int x, int y);
    }
}
