package Railworld_India_PVT_Task;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("Grapes");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}
