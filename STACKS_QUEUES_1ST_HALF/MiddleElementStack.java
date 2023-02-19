package STACKS_QUEUES_1ST_HALF;
import java.util.*;
public class MiddleElementStack{
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> middleStack = new Stack<>();
    private int count = 0;
    private int middle;

    public void push(int x) {
        stack.push(x);
        count++;
        if (count == 1) {
            middleStack.push(x);
            middle = x;
        } else {
            if (x <= middle) {
                middleStack.push(x);
                middle = middleStack.peek();
            }
        }
    }

    public int pop() {
        if (count == 0) {
            throw new EmptyStackException();
        } else {
            int value = stack.pop();
            count--;
            if (value == middle) {
                middleStack.pop();
                if (!middleStack.isEmpty()) {
                    middle = middleStack.peek();
                }
            }
            return value;
        }
    }

    public int getMiddle() {
        if (count == 0) {
            throw new EmptyStackException();
        } else {
            return middle;
        }
    }

    public static void main(String[] args) {
        MiddleElementStack stack = new MiddleElementStack();
        stack.push(20);
        stack.push(10);
        stack.push(30);
        System.out.println("Middle element of the stack: " + stack.getMiddle());
    }
}
