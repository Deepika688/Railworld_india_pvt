package Railworld_India_PVT_Task;


import java.util.HashMap;

public class HashMapCode1 {
    public static void main(String[] args) {
        // Creating a HashMap instance
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding elements to the HashMap
        hashMap.put("apple", 10);
        hashMap.put("banana", 5);
        hashMap.put("orange", 8);

        // Accessing elements from the HashMap
        System.out.println("Number of apples: " + hashMap.get("apple"));
        System.out.println("Number of bananas: " + hashMap.get("banana"));
        System.out.println("Number of oranges: " + hashMap.get("orange"));

        // Checking if a key exists in the HashMap
        String keyToCheck = "banana";
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " is present in the HashMap.");
        } else {
            System.out.println(keyToCheck + " is not present in the HashMap.");
        }

        // Removing an element from the HashMap
        String keyToRemove = "banana";
        hashMap.remove(keyToRemove);
        System.out.println("After removing " + keyToRemove + ", HashMap: " + hashMap);

        // Iterating over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (String key : hashMap.keySet()) {
            int value = hashMap.get(key);
            System.out.println(key + ": " + value);
        }
    }
}

