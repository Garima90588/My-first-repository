import java.util.*;

class Queue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Insert an element
    public void offer(int x) {
        if (size == capacity) {
            System.out.println("Queue is Full");
            return;
        }

        if (size == 0) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        arr[rear] = x;
        size++;
    }

    // Remove an element
    public int poll() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int val = arr[front];

        if (size == 1) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        return val;
    }

    // Return front element
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Display queue
    public void display() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        System.out.print("Queue: ");
        q.display();

        System.out.println("Removed: " + q.poll());
        System.out.println("Removed: " + q.poll());

        System.out.print("Queue after deletion: ");
        q.display();

        q.offer(6);
        q.offer(7);

        System.out.print("Queue after insertion: ");
        q.display();

        System.out.println("Front element: " + q.peek());

        System.out.println("Is Empty: " + q.isEmpty());
        System.out.println("Is Full: " + q.isFull());
    }
}
