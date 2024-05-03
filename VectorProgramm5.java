package Railworld_India_PVT_Task;

import java.util.*;
import java.io.*;
public class VectorProgramm5 {
    public static void main(String[] arg)
        {

            Vector v = new Vector();


            v.add(1);
            v.add(2);
            v.add("Deepika");
            v.add("this is for you");
            v.add(4);


            v.remove(1);


            System.out.println("after removal: " + v);
        }
    }
