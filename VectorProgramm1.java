package Railworld_India_PVT_Task;

import java.util.Iterator;
import java.util.Vector;

public class VectorProgramm1 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Deepika");
        v.add("Durga");
        v.add("Devika");
        v.add("Raha");
        v.add("Akay");

        Iterator<String> itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
