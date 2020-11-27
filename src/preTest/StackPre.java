package preTest;

import java.util.Stack;

public class StackPre {

    static int queueSize(Stack<Integer> q) {
        Stack<Integer> q2 = new Stack<Integer>();
        int counter = 0;
        // how to count amount of objs
        while (!q.empty()) { // while (q.empty()==false)
            q2.push(q.pop());
            counter++;
        }
        /// this point
        while (!q2.empty()) {
            q.push(q2.pop());
        }
        // q = q2;
        return counter;
    }

    public static void main(String[] args) {

        Stack<Integer> q1 = new Stack<Integer>();
        q1.add(5);
        q1.add(3);
        q1.add(8);
        q1.add(4);
        System.out.println(queueSize(q1));
    }
}