package Railworld_India_PVT_Task;

import java.util.LinkedList;
import java.util.Queue;

public class QuesueQuestion  {

    // Function to check if a number is even or odd using queue
    public static void checkEvenOdd(int num) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(num);

        while (!queue.isEmpty()) {
            int currentNum = queue.poll();
            if (currentNum % 2 == 0) {
                System.out.println(currentNum + " is Even");
            } else {
                System.out.println(currentNum + " is Odd");
            }
        }
    }

    // Function to calculate factorial of a number using queue
    public static void calculateFactorial(int num) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(num);

        while (!queue.isEmpty()) {
            int currentNum = queue.poll();
            int factorial = 1;
            for (int i = 2; i <= currentNum; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + currentNum + " is: " + factorial);
        }
    }

    // Function to check if a number is palindrome using queue
    public static void isPalindrome(int num) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(num);

        while (!queue.isEmpty()) {
            int currentNum = queue.poll();
            int reversedNum = 0;
            int originalNum = currentNum;
            while (currentNum != 0) {
                reversedNum = reversedNum * 10 + currentNum % 10;
                currentNum /= 10;
            }
            if (originalNum == reversedNum) {
                System.out.println(originalNum + " is Palindrome");
            } else {
                System.out.println(originalNum + " is not Palindrome");
            }
        }
    }

    // Function to check if a number is prime using queue
    public static void isPrime(int num) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(num);

        while (!queue.isEmpty()) {
            int currentNum = queue.poll();
            boolean isPrime = true;
            if (currentNum <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(currentNum); i++) {
                    if (currentNum % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(currentNum + " is Prime");
            } else {
                System.out.println(currentNum + " is not Prime");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int number = 17; // Change the number as needed

        System.out.println("Checking if " + number + " is Even/Odd:");
        checkEvenOdd(number);
        System.out.println();

        System.out.println("Calculating factorial of " + number + ":");
        calculateFactorial(number);
        System.out.println();

        System.out.println("Checking if " + number + " is Palindrome:");
        isPalindrome(number);
        System.out.println();

        System.out.println("Checking if " + number + " is Prime:");
        isPrime(number);
    }
}

