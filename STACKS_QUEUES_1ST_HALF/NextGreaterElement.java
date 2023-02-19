package STACKS_QUEUES_1ST_HALF;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 4, 1, 2, 9, 7, 5};
        int[] nextGreater = nextGreaterElement(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Element: " + Arrays.toString(nextGreater));
    }
}
