package DataStructure;

public class LinkedList1 {
    Node head;

    static class Node{
        Node next;//null
        int value;
        Node(int value){
            this.next = null;
            this.value = value;//null
        }
    }

    // add value
    public void addvalue(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }

        Node new_node = new Node(value);
        new_node.next = null;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        
    }
    
    // add node at the beginning
    public void addAtBegin(int value){
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;
    }

    // add node in the middle
    public void insertAtMiddle(Node prev_node, int value){
        // check if the node is empty
        if(prev_node == null){
            System.out.println("Node is empty, you cannot insert in the middle");
            return;
        }

        Node new_node = new Node(value);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    // delete node 
    public void deleteNode(int key){
        // check if key located in head
        // if so, delete the first node
        Node temp = head;
        Node prev = null;
        if(temp != null && temp.value == key){
            head = temp.next;
            return;
        }
        // check if key exist in each node
        // keep check every element in the node
        while(temp != null && temp.value != key){
            prev = temp;
            temp = temp.next;
            return;
        } 
        // if key doesn't exist
        if(temp == null) return;
        
        // if key exist after the first node
        prev.next = temp.next;
        

    }

    public void diplay(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    
    public static void main(String[] args) {
        LinkedList1 llist = new LinkedList1();
        
        
        llist.addvalue(10);
        llist.addvalue(20); 
        // llist.addvalue(30);
        // llist.addAtBegin(5);
        // llist.addvalue(40);
        // llist.addAtBegin(2);
        // llist.insertAtMiddle(llist.head.next, 70);
        // llist.deleteNode(30);
        

        llist.diplay();   
    }
}

