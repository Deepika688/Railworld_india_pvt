package Railworld_India_PVT_Task;


//GroupThreadConstructor
class ThreadeCode13 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadeCode13 thread = new ThreadeCode13();

        ThreadGroup tg1 = new ThreadGroup("Parent Thread");
        Thread tg2 = new Thread(tg1, thread, "start");
        tg2.start();

        Thread tg3=new Thread(tg1,thread,"the");
        tg3.start();

        Thread tg4 =new Thread(tg1, thread,"work");
        tg4.start();

        System.out.println("thread Group Name : "+tg1.getName());
        tg1.list();
    }
}
