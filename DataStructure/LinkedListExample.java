package DataStructure;

class LinkedListExample {
    Node head; //head node

    static class Node {
        int data;//Fist node data
        Node next;//null by default

        Node(int d) {
            this.data = d;
        }
    }

    public void printList() {
        System.out.println("First node is " +head.data);
        System.out.println("Next  node is " +head.next);
    }

    public static void main(String[] args) {
        System.out.println("run test main program");
        LinkedListExample lli = new LinkedListExample();
        lli.head = new Node(6);//head pointes to first node
        lli.printList();
    }
    
}
