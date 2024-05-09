package Railworld_India_PVT_Task;

import java.util.HashMap;

public class HashMapCode4 {
    static HashMap<Integer, Long> factorialMap = new HashMap<>();

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (factorialMap.containsKey(n)) {
            return factorialMap.get(n);
        } else {
            long result = n * calculateFactorial(n - 1);
            factorialMap.put(n, result);
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + calculateFactorial(5));
        System.out.println("Factorial of 6: " + calculateFactorial(6));
        System.out.println("Factorial of 7: " + calculateFactorial(7));
        System.out.println("Factorial of 5: " + calculateFactorial(5)); // Retrieving from HashMap
    }
}

