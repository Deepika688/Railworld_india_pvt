package Railworld_India_PVT_Task;

public class PatternProblem4 {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i = 5; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
