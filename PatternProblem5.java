package Railworld_India_PVT_Task;

public class PatternProblem5 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=i; j<=5; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=5; i>=1; i--){
            for(int j=5; j>=i; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
