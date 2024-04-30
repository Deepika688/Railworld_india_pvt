package Railworld_India_PVT_Task;

public class TreadeCode17_PeriorityThread  extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread");
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        TreadeCode17_PeriorityThread tp = new TreadeCode17_PeriorityThread();
        tp.setPriority(10);
        tp.start();
    }
}
