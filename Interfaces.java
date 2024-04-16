package Railworld_India_PVT_Task;

interface Animal1{
    void walk();
}
class Horse1 implements Animal1{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse1 horse1 = new Horse1();
        horse1.walk();
    }
}
