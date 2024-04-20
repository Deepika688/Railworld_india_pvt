package Railworld_India_PVT_Task;

public class StringBuffer_InsertingString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Deepika");
        sb.insert(2, "G");
        String ans = sb.toString();
        System.out.println(ans);
    }
}
