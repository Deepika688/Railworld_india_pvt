package Railworld_India_PVT_Task;

public class StringBuffer_ReversingString {
    public static void main(String[] args) {
        String s = "DEEPIKA SOLANKI";
        StringBuffer sb = new StringBuffer(s);
        String reversedStr = sb.reverse().toString().toLowerCase();
        System.out.println(reversedStr);
    }
}
