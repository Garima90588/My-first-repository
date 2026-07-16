public class SingularLL
{
    static class Node
    {
        int val;
        Node next;
        Node()
        {
            
        }
        
        Node(int val)
        {
            this.val = val;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    public void insert(int val)
    {
        Node newNode = new Node(val);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
        
    }
    
    public void display()
    {
        if(head == null) return;
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val + "->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args)
    {
        SingularLL list = new SingularLL();
        list.insert(0);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();
    }
}
