package Railworld_India_PVT_Task;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

class Product{
    int pid;
    String pname;
    String ptaste;
    String pcolor;
    int prate;
    public Product(int pid,String pname,String ptaste,String pcolor,int prate){
        this.pid= pid;
        this.pname=pname;
        this.ptaste=ptaste;
        this.pcolor=pcolor;
        this.prate=prate;
    }
}

public class StreamProduct {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<Product>();
        list.add(new Product(8545,"Mazaa","Sweet","Yellow",50));
        list.add(new Product(9548,"Kurkure","Spicy","Red",20));
        list.add(new Product(1025,"PaniPuri","Sweet","Yellow",90));
        list.add(new Product(8541,"Choclate","Sweet","Brown",100));
        list.add(new Product(0110,"XYZX","Salty","Green",250));
        list.add(new Product(8555,"ABCD","Sour","Blue",500));

        List<Integer> list1=list.stream().filter(e->e.prate>=100).map(f->f.prate).collect(Collectors.toList());

        System.out.println(list1);

    }
}