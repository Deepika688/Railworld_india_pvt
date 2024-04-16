package Railworld_India_PVT_Task;

class student{
    String name;
    int age;
    public void getinfo(){
        System.out.println("The name of this Student is : "+this.name);
        System.out.println("The age of this Student is : "+this.age);
    }
}
public class ObjectClass {
    public static void main(String[] args) {
      student s1 = new student();
      s1.name = "Deepika";
      s1.age = 20;
      s1.getinfo();

      student s2 = new student();
      s2.name = "Anu";
      s2.age = 21;
      s2.getinfo();
    }

}
