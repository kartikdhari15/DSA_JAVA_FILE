package STACKS_QUEUES_1ST_HALF;
public class queue_scratch{

    private int front;
    private int rear;
    private int size;
    private int[] array;

    public queue_scratch(int size) {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        this.array = new int[size];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear++;
            array[rear] = element;
            System.out.println(element + " enqueued to queue");
        }
    }

    public int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = array[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(element + " dequeued from queue");
            return element;
        }
    }

    public static void main(String[] args) {
        queue_scratch queue = new queue_scratch(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Element at front: " + queue.array[queue.front]);

        while (!queue.isEmpty()) {
            queue.dequeue();
        }

        System.out.println("Queue is empty: " + queue.isEmpty());
    }
}
