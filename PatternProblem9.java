package Railworld_India_PVT_Task;

public class PatternProblem9 {
    public static void main(String[] args) {
        for(char i = 'E'; i>='A'; i--){
            for(char j = 'E'; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for(char i = 'E'; i>= 'A'; i--){
            for(char j=i; j<='E'; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for(char i = 'A'; i<='E'; i++){
            for(char j='E'; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for(char i='E'; i>='A'; i--){
            for(char j = i; j>='A'; j--){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
