package Railworld_India_PVT_Task;

public class StringBuffer_DeletingString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Deepika Solanki");
        sb.delete(6, 10);
        String result = sb.toString();
        System.out.println(result);
    }
}
