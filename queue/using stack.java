import java.util.Stack;

class Queue {
    Stack<Integer> st1;
    Stack<Integer> st2;

    Queue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    // Enqueue
    public void push(int x) {
        st1.push(x);
    }

    // Dequeue
    public int pop() {
        if (st1.isEmpty() && st2.isEmpty())
            return -1;

        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        return st2.pop();
    }

    // Front element
    public int peek() {
        if (st1.isEmpty() && st2.isEmpty())
            return -1;

        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        return st2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return st1.isEmpty() && st2.isEmpty();
    }

    // Display queue (optional)
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        // Front to rear
        for (int i = st2.size() - 1; i >= 0; i--) {
            System.out.print(st2.get(i) + " ");
        }

        for (int i = 0; i < st1.size(); i++) {
            System.out.print(st1.get(i) + " ");
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.pop());   // 10

        q.push(40);

        System.out.println(q.peek());  // 20

        q.display();                   // 20 30 40
    }
}
