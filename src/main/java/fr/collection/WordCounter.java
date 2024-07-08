package fr.collection;

import java.util.HashMap;
import java.util.Map;


/**
 * Exemple d'utilisation d'objet de la classe "HashMap".
 * 
 */
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
}
