package Railworld_India_PVT_Task;

public class Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int a[]=new int[5];//declaration and instantiation
        a[0]=10;//initialization
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;
//traversing array
        for(int i=0;i<a.length;i++)//length is the property of array
            System.out.println(a[i]);

        System.out.println();

        //declaring and initializing 2D array
        int arr2[][]={{1,2,3},{2,4,5},{4,4,5}};
//printing 2D array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
