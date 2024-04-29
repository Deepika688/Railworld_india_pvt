package Railworld_India_PVT_Task;

public class ThreadCode14 extends Thread{
    public void run(){
        try{
            System.out.println(Thread.currentThread().isAlive());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadCode14 thread = new ThreadCode14();
        System.out.println("thread is start or not = "+thread.isAlive());
        thread.start();
        System.out.println("after starting a thread = "+ thread.isAlive());
    }

}
