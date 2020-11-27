package preTest;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {

    static int queueSize(Queue<Integer> q) {
        Queue<Integer> q2 = new LinkedList<Integer>();
        int counter = 0;
        // how to count amount of objs
        while (q.peek() != null) {
            q2.add(q.poll());
            counter++;
        }
        /// this point
        q = q2;
        return counter;
    }

    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<Integer>();
        q1.add(5);
        q1.add(3);
        q1.add(8);
        q1.add(4);
        var temp = q1.peek();
        System.out.println(queueSize(q1));
    }
}