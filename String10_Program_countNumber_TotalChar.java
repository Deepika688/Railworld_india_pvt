package Railworld_India_PVT_Task;

public class String10_Program_countNumber_TotalChar {
    public static void main(String[] args) {
        String s = "this is the best thing to buy a car";
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' ')
                count++;
            }
            System.out.println("total number of characters in string : "+count);

    }
}
