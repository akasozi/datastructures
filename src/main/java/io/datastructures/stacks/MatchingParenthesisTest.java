package io.datastructures.stacks;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class MatchingParenthesisTest {

    public static void main(String[] args) {

        String S = "()(()){([()])}";
        System.out.println("Matching parenthesis: " + parenthesisTest(S));

    }

    public static boolean parenthesisTest(String S) {
        LinkedListStack<Character> stack = new LinkedListStack<>();
        for (char c : S.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
