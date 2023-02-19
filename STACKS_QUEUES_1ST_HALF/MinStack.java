package STACKS_QUEUES_1ST_HALF;
import java.util.Stack;

public class MinStack{
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int x = stack.pop();
        if (x == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;  // or throw an exception
        }
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;  // or throw an exception
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(6);
        minStack.push(2);
        minStack.push(7);
        System.out.println("Minimum element: " + minStack.getMin());  // 2
        }
}
