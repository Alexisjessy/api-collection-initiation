package fr.collection;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static Map<String, Integer> countWordFrequency(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String sentence = "This is a test. This test is only a test.";

        Map<String, Integer> wordFrequency = countWordFrequency(sentence);

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println("Mot : " + entry.getKey() + ", Fréquence : " + entry.getValue());
        }
    }
}
