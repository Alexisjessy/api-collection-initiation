package fr.collection;

import java.util.HashMap;
import java.util.Map;


/**
 * Exemple d'utilisation d'objet de la classe "HashMap"
 * 
 */
public class WordCounter {

    public static Map<String, Integer> countWordFrequency(String sentence) {
        // création du tableau associatif résultat
        Map<String, Integer> wordCount = new HashMap<>();

        // construction d'un tableau 1D de chaînes de caractères
        // en divisant la chaîne avec les espaces
        String[] words = sentence.split("\\s+");

        // on passe en revue tous les mots
        for (String word : words) {
            // passage en minuscules
            word = word.toLowerCase();
            // ajout des duo "clé-valeur" au tableau associatif
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // on retourne le tableau associatif
        return wordCount;
    }
}
