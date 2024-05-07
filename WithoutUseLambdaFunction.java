package Railworld_India_PVT_Task;

interface  Drawable{
    public void draw();
}
public class WithoutUseLambdaFunction {
    public static void main(String[] args) {
        int width = 10;
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing "+" = "+width);
            }
        };
        d.draw();
    }
}
