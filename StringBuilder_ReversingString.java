package Railworld_India_PVT_Task;

public class StringBuilder_ReversingString {
    public static void main(String[] args) {
        String s = "DEEPIKA";
        StringBuilder sb = new StringBuilder(s);
        String reversedStr = sb.reverse().toString().toLowerCase();
        System.out.println(reversedStr);
    }
}
