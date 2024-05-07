package Railworld_India_PVT_Task;

interface start{
     public void show(int x, int y);
}
public class UseLambdaExpression {
    public static void main(String[] args) {
//        int w = 29;
        start s1 =(x, y)->{
            System.out.println(x*y);
        };
        s1.show(19, 7);
    }
}
