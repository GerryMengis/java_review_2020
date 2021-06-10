package DataStructure;

static class Node{
    int data;
    Node next;

    Node(int d) {
        this.data = d;
    }
}

public class InsertLinkedListAtBeginning { 
    Node head;
// Accessing a list 
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("next node is " + temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
      
        InsertLinkedListAtBeginning sll = new InsertLinkedListAtBeginning();
        sll.head = new Node(6);
        Node second = new Node(7);
        sll.head.next = second;
        Node third = new Node(9);
        second.next = third;
        third.next = null;
        // insert node at the beginning 
        Node newNode = new Node(5);
        newNode.next = sll.head;
        sll.head = newNode;

        // Insert node at the middle
        Node temp = new Node(8);
        temp.next = third;
        second.next = temp;        
        // insert at the end 

        sll.printList();
    }
}
