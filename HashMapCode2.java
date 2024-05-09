package Railworld_India_PVT_Task;

import java.util.HashMap;

public class HashMapCode2 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";

        // Creating a HashMap to store word frequency
        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        // Splitting the sentence into words
        String[] words = sentence.split(" ");

        // Counting the frequency of each word
        for (String word : words) {
            // Removing punctuation marks
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                int count = wordFrequencyMap.getOrDefault(word, 0);
                wordFrequencyMap.put(word, count + 1);
            }
        }

        // Displaying word frequency
        System.out.println("Word frequency in the sentence:");
        for (String word : wordFrequencyMap.keySet()) {
            int frequency = wordFrequencyMap.get(word);
            System.out.println(word + ": " + frequency);
        }

        // Checking if a specific word exists in the sentence
        String wordToCheck = "fox";
        if (wordFrequencyMap.containsKey(wordToCheck)) {
            System.out.println("'" + wordToCheck + "' is present in the sentence.");
        } else {
            System.out.println("'" + wordToCheck + "' is not present in the sentence.");
        }

        // Removing a specific word from the HashMap
        String wordToRemove = "lazy";
        if (wordFrequencyMap.containsKey(wordToRemove)) {
            wordFrequencyMap.remove(wordToRemove);
            System.out.println("'" + wordToRemove + "' has been removed from the word frequency analysis.");
        } else {
            System.out.println("'" + wordToRemove + "' is not present in the word frequency analysis.");
        }

        // Displaying updated word frequency
        System.out.println("\nUpdated word frequency after removing '" + wordToRemove + "':");
        for (String word : wordFrequencyMap.keySet()) {
            int frequency = wordFrequencyMap.get(word);
            System.out.println(word + ": " + frequency);
        }
    }
}
