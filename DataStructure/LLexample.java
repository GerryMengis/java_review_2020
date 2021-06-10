package DataStructure;

public class LLexample {
    Node head;//null by default

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    
    void add(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node new_node = new Node(data);
        new_node.next = null;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }  
    }

    public static void main(String[] args) {

        LLexample ll = new LLexample();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        ll.display();
    }
    
}
