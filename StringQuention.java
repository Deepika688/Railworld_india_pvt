package Railworld_India_PVT_Task;

public class StringQuention {
    public static void main(String[] args) {
        String s = "Life is beautiful";
        int sum = s.charAt(0);
        for(int i = 0; i<s.length()-1;  i++){
            if(s.charAt(i) == ' '){
                sum = sum +s.charAt(++i);
            }
        }
        System.out.println("sum of first character : "+ sum);
    }
}
