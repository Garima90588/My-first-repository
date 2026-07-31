class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class Queue
{
    Node front;
    Node rear;
    public void insert(int x)
    {
        Node newnode = new Node(x);
        if(front == null)
        {
            front = newnode;
            rear = newnode;
        }
        else
        {
        rear.next = newnode;
        rear=newnode;
    }
    }
    public int pop()
    {
        if(front == null)
          return -1;
        int data = front.data;
        if(front == rear)
        {
           
            front = null;
            rear = null;
            return data;
        }
        front = front.next;
        return data;
        
        
    }
    
    public int peek()
    {
        if(front == null)
          return -1;
        return front.data;
        
    }
    public void display()
    {
        if(front == null)
          return ;
        Node temp=front;
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
        Queue q = new Queue();
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.insert(6);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.pop());
    }
}
