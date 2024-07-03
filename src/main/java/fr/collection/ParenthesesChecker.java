package fr.collection;

import java.util.Stack;

public class ParenthesesChecker {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "(())";
        String expression2 = "(()))";

        System.out.println("L'expression " + expression1 + " est équilibrée : " + isBalanced(expression1));
        System.out.println("L'expression " + expression2 + " est équilibrée : " + isBalanced(expression2));
    }
}
