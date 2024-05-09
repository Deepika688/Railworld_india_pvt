package Railworld_India_PVT_Task;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


class B{
    int sid;
    String Name;
    String rollNo;
    String address;
    public B(int sid, String name, String rollNo, String address){
        this.sid = sid;
        this.Name = name;
        this.rollNo = rollNo;
        this.address = address;
    }
}
public class JavaStreamDemo {
    public static void main(String[] args) {
        List<B> studentlist=new ArrayList<B>();
        studentlist.add(new B(1, "Deepika", "RWI511", "Bhopal"));
        studentlist.add(new B(2, "Shiva", "RWI512", "Indore"));
        studentlist.add(new B(3, "Devika", "RWI513", "Riva"));
        studentlist.add(new B(4, "Anupama", "RWI514", "Raipur"));
        studentlist.add(new B(5, "Divya", "RWI515", "Mumbai"));

        List<Integer>stateList = studentlist.stream()
                .filter(p->p.sid >=3 )
                .map(m->m.sid)
                .collect(Collectors.toList());




        System.out.println(stateList);


    }
}