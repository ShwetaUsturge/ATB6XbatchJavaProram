package June2024.EX1062024;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class lab6 {
    public static void main(String[] args) {
        //queue
        Queue pq1 = new PriorityQueue();
        pq1.add("K");
        pq1.add("L");
        pq1.add("L");
        pq1.offer("M");
        pq1.add("L");
        System.out.println(pq1);
        System.out.println(pq1.peek());
        System.out.println(pq1.poll());
        Iterator itr= pq1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + "");
        }
    }
}
