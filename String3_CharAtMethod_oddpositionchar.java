package Railworld_India_PVT_Task;

public class String3_CharAtMethod_oddpositionchar {
    public static void main(String[] args) {
        String str = "Deepika Solanki is a Good Student";
        for(int i=0; i<=str.length()-1; i++){
            if(i%2 != 0){
                System.out.println("char at "+i+" place " + str.charAt(i));
            }
        }
    }
}
