package Railworld_India_PVT_Task;

public class StringQuestion3 {
    public static void main(String[] args) {
        char ch[] = {'A','C','a','S'};
        for(int i=0; i<ch.length; i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                System.out.println("Upper case "+" "+ch[i]);
            }else if(ch[i] >= 'a' && ch[i] <= 'z'){
                System.out.println("Lower case "+" "+ch[i]);
            }
        }
    }
}
