package Railworld_India_PVT_Task;

import java.util.*;
class Books{
    int id;
    String name,author,publisher;
    int quantity;
    public Books(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class LinkedListProgramm2 {
    public static void main(String[] args) {
        List<Books> list=new LinkedList<Books>();
        //Creating Books
        Books b1=new Books(101,"OOPs","Deepika Solanki","BPB",10);
        Books b2=new Books(102,"Networking","Ruchika Prashad","Mc Graw Hill",5);
        Books b3=new Books(103,"Operating System","Gaurav Singh","Wiley",11);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list
        for(Books b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
