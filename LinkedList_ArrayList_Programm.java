package Railworld_India_PVT_Task;

import java.util.*;
import java.util.LinkedList;

public class LinkedList_ArrayList_Programm {
    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        LinkedList<String> al2=new LinkedList<>();
        al2.add("James");
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");

        System.out.println("arraylist: "+al);
        System.out.println("linkedlist: "+al2);
    }
}
