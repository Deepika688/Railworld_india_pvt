package Railworld_India_PVT_Task;

public class PatternProblem10 {
    public static void main(String[] args) {
        int n =7;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(i==1 || i==n || j == 1 || j ==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=7; i++)
        {
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k = i; k<=7; k++){
                if(i==1 || i == 7 || k == i || k == 7)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=7; i++){
            for(int j=i; j<7; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                if(i == 1 || i == 7 || k == 1 || k == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
