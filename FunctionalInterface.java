package Railworld_India_PVT_Task;

interface work{
    void start(String msg);
    default void done(){
        System.out.println("learn and enjoy your life");
    }
}
public class FunctionalInterface implements work {
    public void start(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
       FunctionalInterface f1 = new  FunctionalInterface();
       f1.done();
       f1.start("Functional Interface");
    }
}
