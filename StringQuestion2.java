package Railworld_India_PVT_Task;

public class StringQuestion2 {
    public static void main(String[] args) {
        char ch[] = {'a','e','i','o','u'};
        for(int i=0; i<ch.length; i++){
            if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U'){
                System.out.println("Vowel : "+ch[i] + " ");
            }else{
                System.out.println("Vowel not : "+ch[i] + " ");
            }
        }
    }
}
