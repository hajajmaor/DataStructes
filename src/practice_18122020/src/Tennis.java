package src;

import java.util.PriorityQueue;

/**
 * Tennis
 */

public class Tennis {

    public static void playWimbeldon(PriorityQueue<Integer> q) {
        while (q.size() >= 2) {
            int playerOne = q.poll(); // 8
            int playerTwo = q.poll(); // 2
            if (playerOne > playerTwo)
                q.add(playerOne);
            else
                q.add(playerTwo);
        }
        // -------------------
        System.out.println("winner is:" + q.peek());
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> s = new PriorityQueue<Integer>();
        s.add(8);
        s.add(2);
        s.add(3);
        s.add(1);
        playWimbeldon(s);
    }
}