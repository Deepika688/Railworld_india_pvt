package Railworld_India_PVT_Task;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgramm9 {
    public static void main(String[] args) {
        // creating object of ArrayList class
        ArrayList<String> list = new ArrayList<String>();
// adding elements to the ArrayList
        list.add("Data Science");
        list.add("Testing");
        list.add("C#");
        list.add("Basic Language");
        list.add("UML");
        list.add("Algorithms ");
        list.add("Computer Networks");
        list.add("Python");
// printing the unsorted ArrayList
        System.out.println("Before Sorting: "+ list);
// Sorting ArrayList in ascending Order
// using Collection.sort() method
        Collections.sort(list, Collections.reverseOrder());
// Print the sorted ArrayList
        System.out.println("After Sorting: "+ list);
    }
}
