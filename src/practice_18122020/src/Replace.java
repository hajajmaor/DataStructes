package practice_18122020.src;

import java.util.LinkedList;
import java.util.Queue;

public class Replace {
    public static Queue<Integer> replaceInQueue(Queue<Integer> q, int x1, int x2) {

        Queue<Integer> temp = new LinkedList<Integer>();
        while (q.isEmpty() == false) {
            int head = q.poll();
            if (head == x1) {
                temp.add(x2);
            } else {
                temp.add(head);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);
        q.add(4);
        q.add(12);
        q.add(4);
        q.add(8);
        q.add(20);
        q.add(4);
        int x1 = 4;
        int x2 = 99;

        System.out.println(replaceInQueue(q, x1, x2));
    }
}
