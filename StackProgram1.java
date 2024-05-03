package Railworld_India_PVT_Task;

import java.util.Iterator;
import java.util.Stack;

public class StackProgram1 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        s.push("deep");
        s.push("raj");
        s.push("devika");
        s.push("dev");
        s.push("Gaurav");
                s.pop();

        Iterator<String> itr = s.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
