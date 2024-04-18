package Railworld_India_PVT_Task;

public class String4_lengthMethod_totalnumbers_of_character {
    public static void main(String[] args) {
        String str = "Deepika";
        if(str.length() > 0){
            System.out.println("String is not empty and length is : "+str.length());
        }
        str = " ";
        if(str.length() == 0){
            System.out.println("string is empty now : "+str.length());
        }
    }
}
