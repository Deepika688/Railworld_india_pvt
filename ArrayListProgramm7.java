package Railworld_India_PVT_Task;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgramm7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Volkswagen");
        list.add("Toyota");
        list.add("Porsche");
        list.add("Ferrari");
        list.add("Mercedes-Benz");
        list.add("Audi");
        list.add("Rolls-Royce");
        list.add("BMW");

        // printing the unsorted ArrayList
        System.out.println("Before Sorting: "+ list);
// Sorting ArrayList in ascending Order
        Collections.sort(list);
// printing the sorted ArrayList
        System.out.println("After Sorting: "+ list);
    }
}
