package STACKS_QUEUES_1ST_HALF;
import java.util.Stack;

public class ReverseString {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello world";
        String reversed = reverse(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }
}
