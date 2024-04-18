package Railworld_India_PVT_Task;

public class String4_equalsMethod_compare2string {
    public static void main(String[] args) {
        String s1 = "Deepika";
        String s2 = "Deepika";
        String s3 = "DEEPIKA";
        System.out.println(s1.equals(s2));
        if(s1.equals(s3)){
            System.out.println("both string are equal");
        }else{
            System.out.println("both string are not equals");
        }
    }
}
