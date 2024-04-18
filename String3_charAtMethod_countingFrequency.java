package Railworld_India_PVT_Task;

public class String3_charAtMethod_countingFrequency {
    public static void main(String[] args) {
        String s = "Deepika Solanki as a Employee of RailWorld india pvt";
         int count = 0;
         for(int i=0; i<=s.length()-1; i++){
             if(s.charAt(i) == 'a'){
                 count++;
             }
         }
        System.out.println("Frequency of a is : "+count);
    }
}
