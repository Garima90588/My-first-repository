import java.util.Arrays;
class Queue
{
    int arr[];
    int front ;
    int rear ;
    int size;
    Queue(int size)
    {
        arr = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }
    
    public void offer(int x)
    {
         if(isFull())
            return;

        if(isEmpty())
           front = 0;

         arr[++rear] = x;
    }
    
    public int poll()
    {
        int value = arr[front];

        if(front == rear)
        {
         front = -1;
         rear = -1;
        }
      else
     {
       front++;
     }

     return value;
    }
    
    
    public void display()
    {
        if(isEmpty())
           return;
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public int peek()
    {
        if(isEmpty())
          return -1;
        return arr[front];
    }
    public boolean isEmpty()
    {
        return front == -1;
    }
    
    public boolean isFull()
    {
        return rear == (size-1);
    }
    
}

public class Main
{
    public static void main(String[] args)
    {
        Queue q = new Queue(6);
        q.offer(1);
        q.offer(2);
        System.out.println(q.poll());
        System.out.println(q.peek());
        q.display();
    }
}
