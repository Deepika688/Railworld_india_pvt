package Railworld_India_PVT_Task;

class thread1 extends Thread{
    public void run(){
        System.out.println("start the thread");
    }
}
class thread2 extends Thread{
    public void run(){
        System.out.println("Run the thread");
    }
}


public class ThreadClass {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        t1.start();
        thread2 t2 = new thread2();
        t2.start();
    }
}
