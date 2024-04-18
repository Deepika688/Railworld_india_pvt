package Railworld_India_PVT_Task;

public class String_split_Method {
    public static void main(String[] args) {
        String s1 = "java String split method by javaPoint";
        String[] words = s1.split("\\s");
        for(String w : words){
            System.out.println(w);
        }
    }
}
