package Railworld_India_PVT_Task;

public class String7_replace_method3 {
    public static void main(String[] args) {
        String s = "oooooo-hhhhh-oooooo";
        String rs = s.replace("h","s");
        System.out.println(rs);
        rs = rs.replace("s","h");
        System.out.println(rs);
    }
}
