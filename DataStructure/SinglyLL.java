package DataStructure;

static class Node{
    int data;
    Node next;

    Node(int d) {
        this.data = d;
    }
}

public class SinglyLL {
    Node head;
// Accessing a list 
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("next node is " + temp.data + " ");
            System.out.println("next node is " + temp.next + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
      
        SinglyLL sll = new SinglyLL();
        sll.head = new Node(6);
        Node second = new Node(7);
        sll.head.next = second;
        Node third = new Node(8);
        second.next = third;
        third.next = null;
        sll.printList();
    }
    
}
