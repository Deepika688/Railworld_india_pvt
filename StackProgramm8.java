package Railworld_India_PVT_Task;

import java.util.Iterator;
import java.util.Stack;

public class StackProgramm8 {
    public static void main (String[] args)
    {

        Stack stk = new Stack();

        stk.push("BMW");
        stk.push("Audi");
        stk.push("Ferrari");
        stk.push("Bugatti");
        stk.push("Jaguar");

        Iterator iterator = stk.iterator();
        while(iterator.hasNext())
        {
            Object values = iterator.next();
            System.out.println(values);
        }
    }
}
