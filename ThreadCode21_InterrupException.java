package Railworld_India_PVT_Task;

public class ThreadCode21_InterrupException extends  Thread{
    public void  run(){
//        try{
            for(int i=1; i<5; i++){
                System.out.println(i);
//                Thread.sleep(1000);
            }
        }
//        catch (Exception e){
//            System.out.println(e);
////            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
        ThreadCode21_InterrupException t = new ThreadCode21_InterrupException();
        t.start();
        t.interrupt();
    }
}
