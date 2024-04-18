package Railworld_India_PVT_Task;

public class String4_lengthMethod_Reverse_String {
    public static void main(String[] args) {
        String s = "deepika is employee of railworld india pvt";
        int size = s.length();
        System.out.println("Reverse of the string : "+ "'"+s+"'"+" is");

        for(int i=0;i<size; i++){
            System.out.print(s.charAt(s.length()-i-1));
        }
    }
}
