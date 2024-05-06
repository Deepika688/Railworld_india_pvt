package Railworld_India_PVT_Task;

abstract class Student{
 abstract void start();

}
public class Annonyamus {
    public static void main(String[] args) {
        Student s1 = new Student(){
            @Override
            void start() {
                System.out.println("nice work");
            }
        };
        s1.start();


    }
}
