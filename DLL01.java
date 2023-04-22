public class DLL01 
{
    class Node 
    {
        int data;
        Node prev;
        Node next;

        public Node(int data) 
        {
            this.data = data;
        }
    }
    
    public static void main(String[] args) 
    {
        DLL01 dList = new DLL01();

        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);

        dList.display();
    }

    Node head=null, tail = null;

    public void addNode(int data) 
    {
        Node newNode = new Node(data);

        if (head == null) 
        {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    
    public void display() 
    {
        Node current = head;
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}