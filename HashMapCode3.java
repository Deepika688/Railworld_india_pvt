package Railworld_India_PVT_Task;

import java.util.HashMap;

public class HashMapCode3 {
    static HashMap<Integer, String> resultMap = new HashMap<>();

    public static String checkEvenOdd(int number) {
        if (resultMap.containsKey(number)) {
            return resultMap.get(number);
        } else {
            String result = (number % 2 == 0) ? "Even" : "Odd";
            resultMap.put(number, result);
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("5 is " + checkEvenOdd(5));
        System.out.println("6 is " + checkEvenOdd(6));
        System.out.println("7 is " + checkEvenOdd(7));
        System.out.println("5 is " + checkEvenOdd(5)); // Retrieving from HashMap
    }
}

