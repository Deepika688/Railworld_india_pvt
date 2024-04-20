package Railworld_India_PVT_Task;

public class StringBuilder_DeletingCharacters {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Deepika Solanki");
        sb.delete(6, 10);
        String result = sb.toString();
        System.out.println(result);
    }
}
