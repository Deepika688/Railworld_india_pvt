package Railworld_India_PVT_Task;

public class ThreadCode16 extends Thread{
    public void run(){
        System.out.println("This is child Thread");
    }

    public static void main(String[] args) {
        System.out.println("parent thread");
        ThreadCode16 t1 = new ThreadCode16();

        t1.setDaemon(true);
        t1.start();
    }
}
