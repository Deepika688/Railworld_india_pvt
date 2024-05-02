package Railworld_India_PVT_Task;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgramm1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Deepika");
        list.add("Devika");
        list.add("Raj");
        list.add("Gaurav");
        System.out.println(list);
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
