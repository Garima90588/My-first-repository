import java.util.ArrayList;

class Stack {

    ArrayList<Integer> list;
    int top = -1;

    Stack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
        top++;
    }

    public int pop() {

        if(top == -1)
            return -1;

        return list.remove(top--);
    }

    public int peek() {

        if(top == -1)
            return -1;

        return list.get(top);
    }

    public boolean isEmpty() {

        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(0);
        st.push(2);

        System.out.println(st.pop());   // 2
        System.out.println(st.peek());  // 0
        System.out.println(st.isEmpty()); // false
    }
}
