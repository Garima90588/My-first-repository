class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Stack
{
    Node top;
    Stack()
    {
        top = null;
    }
    
    public void insert(int x)
    {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }
    
    public int pop()
    {
       if(top == null)
        return -1;

       int value = top.data;
       top = top.next;
       return value;
    }
        
        
    public int peek()
    {
        if(top == null)
          return -1;
        return top.data;
    }
    public boolean isEmpty()
    {
        return top == null;
    }
    public void display()
    {
        if(top == null)
          return;
        Node temp = top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
}

public class Main
{
    public static void main(String[] args)
    {
        Stack st = new Stack();
        st.insert(1);
        st.insert(2);
        st.insert(3);
        System.out.print(st.pop());
        st.display();
    }
}
