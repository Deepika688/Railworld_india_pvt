package Railworld_India_PVT_Task;

public class String3_charAtMethodEX2 {
    public static void main(String[] args) {
        String str = "Deepika Solanki Is a New Student";
        int strLength  = str.length();
        //fatching first character
        System.out.println("character of Oth index is : "+str.charAt(0));
        //the last character is present at the string length=1 index

        System.out.println("character at last index is: "+str.charAt(strLength-1));
    }
}
