package Railworld_India_PVT_Task;

public class String4_lengthMethod_WhiteSpacesPresent {
    public static void main(String[] args) {
        String str = "Deep what are you doing write now";
        int sizeWithWhiteSpaces = str.length();

        System.out.println("In the String : "+ "'"+str+"'");
         str = str.replace(" ","");
         int sizeWithoutWhiteSpaces = str.length();
         int numberOfWhiteSpaces = sizeWithWhiteSpaces - sizeWithoutWhiteSpaces;
        System.out.println("Total Number of WHiteSpace Present are : "+numberOfWhiteSpaces);
    }
}
