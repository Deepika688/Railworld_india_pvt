package Railworld_India_PVT_Task;

import java.util.HashMap;

public class HashMapCode5 {
    static HashMap<String, Boolean> palindromeMap = new HashMap<>();

    public static boolean isPalindrome(String str) {
        if (palindromeMap.containsKey(str)) {
            return palindromeMap.get(str);
        } else {
            int start = 0;
            int end = str.length() - 1;
            while (start < end) {
                if (str.charAt(start++) != str.charAt(end--)) {
                    palindromeMap.put(str, false);
                    return false;
                }
            }
            palindromeMap.put(str, true);
            return true;
        }
    }

    public static void main(String[] args) {
        String str1 = "radar";
        String str2 = "hello";

        System.out.println(str1 + " is palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is palindrome: " + isPalindrome(str2));
        System.out.println(str1 + " is palindrome: " + isPalindrome(str1)); // Retrieving from HashMap
    }
}

