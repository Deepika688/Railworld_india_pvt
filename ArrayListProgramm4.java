package Railworld_India_PVT_Task;

import java.util.ArrayList;

public class ArrayListProgramm4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("array is empty : "+list.isEmpty());
        list.add("deep");
        list.add("raj");
        list.add("dev");
        list.add("devika");
        System.out.println("After insertion");
        System.out.println("is arrayList Empty : "+list.isEmpty());
    }
}
