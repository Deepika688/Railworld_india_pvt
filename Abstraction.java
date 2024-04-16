package Railworld_India_PVT_Task;

abstract class Animal{
    abstract void walk();
    void breathe(){
        System.out.println("This animal breathes air");
    }
    Animal(){
        System.out.println("You are about to create an animal");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("wow, you have create a horse");
    }
    void walk(){
        System.out.println("horse walks on 4 legs");
    }
}
class chicken extends Animal{
    chicken(){
        System.out.println("wow, you have create a chicken");
    }
    void walk(){
        System.out.println("chicken walks on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.breathe();
    }
}
