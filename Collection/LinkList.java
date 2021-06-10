package Collection;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkList {
    public static void main(String[] args) {
 
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Sam");
        ll1.add("David");
        ll1.add("George");

        System.out.println(ll1);

        ll1.add(1, "Smith");
        System.out.println(ll1);

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Gerry");
        ll2.add("Bob");

        ll1.addAll(ll2);
        // print each element
        Iterator<String> itr1 = ll1.iterator();
        while (itr1.hasNext()) {
            System.out.print(" " + itr1.next());
        }
        System.out.println();

        // Add value in the first node
        ll1.addFirst("John");
        ll1.addLast("God");
        System.out.println(ll1);

        // Remove element explicitly or from specific index.
        ll1.remove("George");
        ll1.remove("God");
        ll1.remove(0);
        System.out.println(ll1);

        ll1.removeFirst();
        ll1.removeLast();
        System.out.println(ll1);

        // Print element in Descending order
        Iterator<String> i = ll2.descendingIterator();
        while (i.hasNext()) {
            System.out.print(" " + i.next());
        }
        System.out.println();

        Iterator<String> j = ll1.descendingIterator();
        while (j.hasNext()) {
            System.out.print(" " + j.next());
        }
        System.out.println();

        LinkedList<String> ll3 = new LinkedList<>();
            ll3.add("Swiss");
            ll3.add("Holland");
            ll3.add("England");
        
            LinkedList<String> ll4 = new LinkedList<>();
            ll4.add("USA");
            ll4.add("Canada");
            ll4.add("Russia");

            ll3.addAll(ll4);
            System.out.println("Added elements " + ll3);
            ll3.addAll(0, ll4);
            System.out.println("New added elements " + ll3);
    }

}













