package Railworld_India_PVT_Task;

public class ThreadCode15 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("thread Task1");
    }
    public void runs(){
        System.out.println(Thread.currentThread().getName());
//        System.out.println("thread Task2");
    }

    public static void main(String[] args) {
        ThreadCode15 t1 = new ThreadCode15();
        t1.start();
        t1.runs();
        System.out.println(Thread.currentThread().getName());
    }
}
