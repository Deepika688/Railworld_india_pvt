package Railworld_India_PVT_Task;

class Student12{
    String name;
    static String school;
}
public class Static {
    public static void main(String[] args) {
        Student12.school = "SSVM";
        Student12 s12 = new Student12();
        s12.name = "tony";
        System.out.println(s12.school);
    }
}
