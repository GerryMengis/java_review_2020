package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueDeque {
    public static void main(String[] args) {
        
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Vivian");
        pq.add("Zoyheb");
        pq.add("Sue");

        System.out.println("head: " + pq.element());
        System.out.println("head: " + pq.peek());
        System.out.println("Remove : " + pq.remove());
        System.out.println("queue: " + pq);

        Deque<String> dq = new ArrayDeque<>();
        dq.add("Vivian");
        dq.add("Zoyhb");
        dq.add("Sue");
        dq.offerFirst("Gerry");

        System.out.println("pollLast: " + dq.pollLast());
        System.out.println("offerFirst: " + dq.offerFirst("Sam"));
        System.out.println("Deque: " + dq);

    }
    
}
