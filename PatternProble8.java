package Railworld_India_PVT_Task;

public class PatternProble8 {
    public static void main(String[] args) {
        for(int i=1; i<=7; i++){
            for(int j=1; j<= 7; j++){
                if(j==1 || j==7  || (i==j))
                    System.out.print("+");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
