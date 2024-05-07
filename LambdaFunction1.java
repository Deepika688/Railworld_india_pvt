package Railworld_India_PVT_Task;

interface EveOdd{
    public void run(int x);

}
public class LambdaFunction1 {
    public static void main(String[] args) {
        EveOdd e1 = (x)->{
            if(x%2==0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }

        };
        e1.run(2);
    }

}
