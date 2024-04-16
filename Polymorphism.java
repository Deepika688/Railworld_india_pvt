package Railworld_India_PVT_Task;

/** Compile Time Polymorphism **/
class Students{
    String name;
    int age;
    public void displayInfo(String name){
        System.out.println(name);
    }
    public void displayInfo(int age){
        System.out.println(age);
    }
    public void displayInfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
}
/** Run time polymorphism **/
class shape{
    public void area(){
        System.out.println("Displays area of shape");
    }
}
class Triiangle extends shape{
    public void area(int h, int b){
        System.out.println((1/2)*b*h);
    }
}
class circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class Polymorphism {
    public static void main(String[] args) {

    }
}
