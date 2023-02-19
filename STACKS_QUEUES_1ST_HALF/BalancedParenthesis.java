package STACKS_QUEUES_1ST_HALF;
import java.util.Stack;
public class BalancedParenthesis{
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr1 = "((a + b) * (c - d))";
        String expr2 = "[(a + b) * {(c + d) / (e - f)}]";
        String expr3 = "((a + b) * (c - d)))";
        String expr4 = "[(a + b) * {(c + d) / (e - f)}}]";
        System.out.println(isBalanced(expr1));    // true
        System.out.println(isBalanced(expr2));    // true
        System.out.println(isBalanced(expr3));    // false
        System.out.println(isBalanced(expr4));    // false
    }
}
