package fr.collection;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Exemple d'utilisation d'objet de la classe "Stack".
 * 
 */
public class ParenthesesChecker {

    /**
     * Permet de trouver si toutes parenthèse ouvrante d'un expression est correctement fermée
     * 
     * @param expression La chaîne de caractères à traiter
     * @return VRAI -> si autant de parenthèses fermantes qu'ouvrantes, FAUX dans le cas contraire
     */
    public static boolean isBalanced(String expression) throws EmptyStackException {
        // création d'un nouvelle pile
        Stack<Character> stack = new Stack<>();

        try {
        // on passe en revu tous les caractères de la chaîne de caractères à tratier
            for (char ch : expression.toCharArray()) {
                // si parenthèse ouvrant -> on ajoute un élément à la pile
                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') { // si parenthèse fermante, on enlève l'élément de la pile
                    if (stack.isEmpty() || stack.pop() != '(') { 
                        return false;
                    }
                }
            }
                    
        } catch (EmptyStackException exception) {
            // gestion de l'erreur
            System.err.println(exception.getMessage());
        }

        // retour du résultat
        // VRAI -> si autant de parenthèses fermantes qu'ouvrantes, FAUX dans le cas contraire
        return stack.isEmpty();
    }
}
