package Railworld_India_PVT_Task;

public class ThreadeRunnable implements Runnable {
    public void run(){
        System.out.println("This is Thread class");
    }

    public static void main(String[] args) {
        ThreadeRunnable t1 = new ThreadeRunnable();
        Thread th = new Thread(t1);
        th.start();
    }
}
