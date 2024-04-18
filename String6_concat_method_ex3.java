package Railworld_India_PVT_Task;

public class String6_concat_method_ex3 {
    public static void main(String[] args) {
        String s1 = "deepika";
        String s2 = "Solanki";
        String s3 = "Student";
        //concatenating special chars
        String s4 = s1.concat(" ").concat(s2).concat(" ").concat(s3);
        System.out.println(s4);
        //concatenating special chars

        String s5 = s1.concat("!!!");
        System.out.println(s5);
        String s6 = s1.concat("@").concat(s2);
        System.out.println(s6);
    }
}
