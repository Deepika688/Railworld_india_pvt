package Railworld_India_PVT_Task;

public class ThreadCode20_practice extends Thread{
    public void run(){
        for(int i=1; i<5; i++){
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.err.println(e);
            }
            System.out.println(i);
        }
        for(int i=1; i<5; i++){
            System.out.println(Thread.currentThread().getName()+"MyThread");
        }
        for(int i=1; i<5; i++){
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ThreadCode20_practice p = new ThreadCode20_practice();
        ThreadCode20_practice p2 = new ThreadCode20_practice();



        p.start();
        p2.start();

        ThreadCode20_practice ym = new ThreadCode20_practice();
        ThreadCode20_practice ym2 = new ThreadCode20_practice();

        ym.start();
        ym2.start();

        for(int i = 1; i<5; i++){
            ym.yield();
            System.out.println(Thread.currentThread().getName()+"  myThread1");
        }

        ThreadCode20_practice jm = new ThreadCode20_practice();
        ThreadCode20_practice jm2 = new ThreadCode20_practice();
        ThreadCode20_practice jm3 = new ThreadCode20_practice();

        jm.start();
        try{
            jm.join();
        }catch (Exception e){
            System.out.println(e);
        }
        jm2.start();
        jm3.start();
    }
    }

