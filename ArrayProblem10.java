package Railworld_India_PVT_Task;

import java.util.Arrays;

public class ArrayProblem10 {

    public static void move(int[] arr)
    {
        Arrays.sort(arr);
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        move(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }
}
