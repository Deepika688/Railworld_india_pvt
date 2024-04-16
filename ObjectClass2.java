package Railworld_India_PVT_Task;

class Pen{
    String color;
    String type; //ballpoint, gel

    public void writ(){
        System.out.println("Writing Something");
    }

    public void printInfo(){
        System.out.println(this.color);
    }
}
public class ObjectClass2 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "gel";

        Pen p2 = new Pen();
        p2.color = "Black";
        p2.type = "ballpoint";

        p1.printInfo();
        p2.printInfo();
    }
}
