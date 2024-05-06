package Railworld_India_PVT_Task;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetProgramm10IteratorMethod {
    public static void main(String args[])
    {
        Set<Integer> data = new LinkedHashSet<Integer>();
        data.add(31);
        data.add(21);
        data.add(41);
        data.add(51);
        data.add(11);
        data.add(81);
        System.out.println("data: " + data);

        Iterator newData = data.iterator();
        System.out.println("The NewData values are: ");
        while (newData.hasNext()) {
            System.out.println(newData.next());
        }
    }
}
