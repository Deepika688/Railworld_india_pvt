package Railworld_India_PVT_Task;

import java.util.*;
public class VectorProgramm6 {
  public static void main(String args[])
        {
            Vector<String> v = new Vector<>();


            v.add("Deepika");
            v.add("Devika");
            v.add(1, "and");


            for (int i = 0; i < v.size(); i++) {

                System.out.print(v.get(i) + " ");
            }

            System.out.println();


            for (String str : v)
                System.out.print(str + " ");
        }
    }

