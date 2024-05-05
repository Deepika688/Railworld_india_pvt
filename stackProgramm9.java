package Railworld_India_PVT_Task;

import java.util.Stack;

public class stackProgramm9 {
    public static void main (String[] args)
    {
        Stack<Integer> stk = new Stack<>();
        stk.push(119);
        stk.push(203);
        stk.push(988);
        System.out.println("Iteration over the stack using forEach() Method:");
        stk.forEach(n ->
        {
            System.out.println(n);
        });
    }
}
