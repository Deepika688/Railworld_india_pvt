package Railworld_India_PVT_Task;

public class StringBuilder_InsertingCharacters {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Deepika");
        sb.insert(2, "G");
        String ans = sb.toString();
        System.out.println(ans);
    }
}
