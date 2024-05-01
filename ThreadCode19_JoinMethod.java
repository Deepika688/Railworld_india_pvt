package Railworld_India_PVT_Task;

public class ThreadCode19_JoinMethod extends Thread {
   public void run(){
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
     ThreadCode19_JoinMethod jm = new ThreadCode19_JoinMethod();
      ThreadCode19_JoinMethod jm2 = new ThreadCode19_JoinMethod();
      ThreadCode19_JoinMethod jm3 = new ThreadCode19_JoinMethod();

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
