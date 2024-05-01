package Railworld_India_PVT_Task;

public class ThreadCode17_SleepMethod extends  Thread{
    public  void  run(){
        for(int i= 1; i<5; i++){
            try{
                Thread.sleep(1000);
            }catch (Exception e) {
//                e.printStackTrace();
                System.err.println(e);
            }
                System.out.println(i);

        }
    }

    public static void main(String[] args) {
        ThreadCode17_SleepMethod sm = new ThreadCode17_SleepMethod();
        ThreadCode17_SleepMethod sm2 = new ThreadCode17_SleepMethod();
        sm.start();
        sm2.start();
    }
}
