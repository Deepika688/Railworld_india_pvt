package Railworld_India_PVT_Task;

public class String10_program_countPunctuation {
    public static void main(String[] args) {

        int count = 0;
        String s = "He said, 'The mailman loves you.' I heard it with my own ears.";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '-'
            || s.charAt(i) == '\'' || s.charAt(i) == '\"' || s.charAt(i) == ':'){
                count++;
            }
        }
        System.out.println("the number of punctuations exists in the string is : "+count);
    }
}
