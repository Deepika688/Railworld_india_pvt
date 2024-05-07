package Railworld_India_PVT_Task;

interface start1{
    public  void show(int x);
}
public class LambdaFunction2 {
    public static void main(String[] args) {

      start1   s1 = x -> System.out.println(x % 2 == 0);
        s1.show(11);
    }
}
