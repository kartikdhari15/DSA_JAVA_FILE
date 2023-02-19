package STACKS_QUEUES_1ST_HALF;
import java.util.*;
public class NStacks{
    private int[] arr;      // the array to hold the stacks
    private int[] top;      // the index of the top element of each stack
    private int[] next;     // the next available index in the array
    private int n;          // number of stacks
    private int size;       // size of each stack

    // Constructor
    public NStacks(int n, int size) {
        this.n = n;
        this.size = size;
        this.arr = new int[n * size];
        this.top = new int[n];
        this.next = new int[n];

        // Initialize top and next indices of each stack
        for (int i = 0; i < n; i++) {
            top[i] = -1;
            next[i] = i * size;
        }
    }

    // Push an element onto a stack
    public void push(int stackNum, int data) {
        if (stackNum < 0 || stackNum >= n) {
            throw new IllegalArgumentException("Invalid stack number.");
        }
        if (next[stackNum] >= (stackNum + 1) * size) {
            throw new StackOverflowError("Stack overflow.");
        }
        arr[next[stackNum]] = data;
        top[stackNum] = next[stackNum];
        next[stackNum]++;
    }

    // Pop an element from a stack
    public int pop(int stackNum) {
        if (stackNum < 0 || stackNum >= n) {
            throw new IllegalArgumentException("Invalid stack number.");
        }
        if (top[stackNum] == -1) {
            throw new EmptyStackException();
        }
        int data = arr[top[stackNum]];
        top[stackNum]--;
        next[stackNum] = top[stackNum] + 1;
        return data;
    }

    // Check if a stack is empty
    public boolean isEmpty(int stackNum) {
        if (stackNum < 0 || stackNum >= n) {
            throw new IllegalArgumentException("Invalid stack number.");
        }
        return top[stackNum] == -1;
    }

    // Get the top element of a stack
    public int peek(int stackNum) {
        if (stackNum < 0 || stackNum >= n) {
            throw new IllegalArgumentException("Invalid stack number.");
        }
        if (top[stackNum] == -1) {
            throw new EmptyStackException();
        }
        return arr[top[stackNum]];
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        NStacks stacks = new NStacks(3, 5);
        stacks.push(0, 1);
        stacks.push(0, 2);
        stacks.push(0, 3);
        stacks.push(1, 4);
        stacks.push(1, 5);
        stacks.push(2, 6);
        System.out.println(stacks.pop(0));    // 3
        System.out.println(stacks.pop(1));    // 5
        System.out.println(stacks.pop(2));    // 6
        System.out.println(stacks.isEmpty(0));
    }
}