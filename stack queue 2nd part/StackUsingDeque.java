import java.util.Deque;
import java.util.LinkedList;
class StackUsingDeque {
    
    private static Deque<Integer> deque;
    private static void push(int x) {
        
        deque.addFirst(x);
    }
    private static int pop() {
        
        if (!deque.isEmpty()) {
            return deque.removeFirst();
        }
        return -1;
    }
    private static boolean isEmpty() {
        
        return deque.isEmpty();
    }
    private static int size() {
        
        return deque.size();
    }
    public static void main(String[] args) {
        deque = new LinkedList<>();
        
        push(1);
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(isEmpty());
        System.out.println(pop());
        System.out.println(size());
    }
}