package Railworld_India_PVT_Task;

public class copy_Array_Elements {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7};
        int arr2[] = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.println("Elements of original array : ");
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]+" ");
        }
        System.out.println();

        System.out.println("Elements of new array : ");
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]+" ");
        }
    }
}
