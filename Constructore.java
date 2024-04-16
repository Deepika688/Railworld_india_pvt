package Railworld_India_PVT_Task;

/** Non Parameterized Constructore **/
class Student{
    String name;
    int age;

    Student(){
        System.out.println("constructor called");
    }
}
/**  Parameterized Constructore **/
class Student1{
    String name;
    int age;
    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }
}
/** Copy Constructore but java does not support **/
class Student2{
    String name;
    int age;
    Student2(student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}
public class Constructore {
    public static void main(String[] args) {

    }
}
