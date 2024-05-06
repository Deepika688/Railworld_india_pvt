package Railworld_India_PVT_Task;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetProgramm8HashCodeMethod {
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
        System.out.println("\nThe hash code value of set is:"+ data.hashCode());
    }
}
