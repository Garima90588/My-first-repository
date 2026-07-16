public class CircularLL
{
    private class Node
    {
        int val;
        Node next;
        
        public Node()
        {
            
        }
        
        public Node(int val)
        {
            this.val = val;
            this.next=null;
          
        }
        
    }
    
    Node head;
    Node tail;
    public void insert(int val)
    {
        Node newNode = new Node(val);
        if(head == null)
        {
            head = newNode;
            tail=head;
            return;
        }
        tail.next=newNode;
        tail=tail.next;
        tail.next=head;
    }
    public void display()
    {
        if(head==null)
          return;
        Node temp=head;
        System.out.print(temp.val+"->");
        temp=temp.next;
        while(temp!=head)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        
        
    }
    public static void main(String[] args)
    {
        CircularLL newNode=new CircularLL();
        newNode.insert(0);
        newNode.insert(1);
        newNode.insert(2);
        newNode.insert(3);
        newNode.display();
    }
}
