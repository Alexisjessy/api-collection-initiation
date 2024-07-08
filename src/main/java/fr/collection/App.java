package fr.collection;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "----- Exercice d'entraînement à l'utilisation de \"Stack\"" );
    
        boolean result = ParenthesesChecker.isBalanced(")");
        System.out.println("L'expression 1 est équilibrée : " + result);

        result = ParenthesesChecker.isBalanced("(()))");
        System.out.println("L'expression 2 est équilibrée : " + result);

        result = ParenthesesChecker.isBalanced("()(");
        System.out.println("L'expression 3 est équilibrée : " + result);

        result = ParenthesesChecker.isBalanced("public static void main(String[] arg)");
        System.out.println("L'expression 4 est équilibrée : " + result);

        result = ParenthesesChecker.isBalanced("Le petit poisson (rouge) mange des graines (beaucoup)");
        System.out.println("L'expression 5 est équilibrée : " + result);


        System.out.println( "\n----- Exercice d'entraînement à l'utilisation de \"HashMap\"" );
        String sentence = "This is a test. This test is only a test.";

        Map<String, Integer> wordFrequency = WordCounter.countWordFrequency(sentence);

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println("Mot : " + entry.getKey() + ", Fréquence : " + entry.getValue());
        }
    }
}
