class Stack {
    
    int[] arr;
    int top;
    int size;

    // Constructor
    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push operation
    public void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = x;
    }
    
    public void resize()
    {
        int [] temp = new int [size * 2];
        for(int i=0;i<size;i++)
        {
            temp[i]=arr[i];
        }
        arr = temp;
        size=2*size;
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    // Peek operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    // Check empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check full
   
}

public class Main {
    public static void main(String[] args) {

        Stack st = new Stack(5);

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.pop());   // 30
        System.out.println(st.peek());  // 20

        System.out.println(st.isEmpty()); // false
    }
}
