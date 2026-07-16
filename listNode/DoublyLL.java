public class DoublyLL
{
    private class Node
    {
        int val;
        Node next;
        Node prev;
        public Node()
        {
            
        }
        
        public Node(int val)
        {
            this.val = val;
            this.next=null;
            this.prev=null;
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
        newNode.prev=tail;
        tail.next=newNode;
        tail=tail.next;
        
    }
    public void display()
    {
        if(head==null)
          return;
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"-><-");
            temp=temp.next;
        }
        System.out.print("null");
        
    }
    public static void main(String[] args)
    {
        DoublyLL newNode=new DoublyLL();
        newNode.insert(0);
        newNode.insert(1);
        newNode.insert(2);
        newNode.insert(3);
        newNode.display();
    }
}
