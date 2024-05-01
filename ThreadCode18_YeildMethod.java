package Railworld_India_PVT_Task;

public class ThreadCode18_YeildMethod extends Thread{
    public void run(){
        for(int i=1; i<5; i++){
            System.out.println(Thread.currentThread().getName()+ "myThread");
        }
    }

    public static void main(String[] args) {
        ThreadCode18_YeildMethod ym = new ThreadCode18_YeildMethod();
        ThreadCode18_YeildMethod ym2 = new ThreadCode18_YeildMethod();
        ym.start();
        ym2.start();

        for(int i = 1; i<5; i++){
            ym.yield();
            System.out.println(Thread.currentThread().getName()+"  myThread1");
        }
    }
}
