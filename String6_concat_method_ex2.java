package Railworld_India_PVT_Task;

public class String6_concat_method_ex2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "my";
        String s3 = "dear";
        //concatenating one string
        String s4 = s1.concat(s2);
        System.out.println(s4);
        String s5 = s1.concat(s2).concat(s3);
        System.out.println(s5);
    }
}
