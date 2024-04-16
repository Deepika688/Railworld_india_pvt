package Railworld_India_PVT_Task;

/** Single Inheritance **/
class shape1{
    public void area(){
        System.out.println("Display area of shape");
    }
}
class Triangle extends shape{
    public void area(int h, int b){
        System.out.println((1/2)*b*h);
    }
}

/** Hierarchical inheritance **/
class shap2{
    public void area(){
        System.out.println("Displays area of shape");
    }
}
class Triangle2 extends shape{
    public void area(int H, int B){
        System.out.println((1/2)*B*H);
    }
}
class Circle extends shap2{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

/** Multilevel Inheritance **/
class shape3{
    public void area(){
        System.out.println("Displays area of shape");
    }
}
class Triangle3 extends shape3{
    public void area(int h1, int b1){
        System.out.println((1/2)*b1*h1);
    }
}
class EquilateralTriangle extends Triangle3{
    int side;
}

public class Inheritance {
    public static void main(String[] args) {

    }
}
