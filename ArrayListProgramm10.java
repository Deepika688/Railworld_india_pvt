package Railworld_India_PVT_Task;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgramm10 {
    public static void main(String args[])
    {
//first array list
        ArrayList<String> firstList=new ArrayList<String>();
//adds elements to the arraylist
        firstList.add("Apple");
        firstList.add("Pears");
        firstList.add("Guava");
        firstList.add("Mango");
        System.out.println(firstList);

        List<String> secondList=new ArrayList<String>();

        secondList.add("Apple");
        secondList.add("Pears");
        secondList.add("Guava");
        secondList.add("Mango");
        System.out.println(secondList);

        boolean boolval = firstList.equals(secondList); //returns true because lists are equal
        System.out.println(boolval);
        secondList.add("Papaya");

        boolean bool = firstList.equals(secondList); //returns false because lists are not equal
        System.out.println(bool);
    }
}
