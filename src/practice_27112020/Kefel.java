package practice_27112020;

public class Kefel {

    public static void f3(int n) {// n=300
        for (int i = n; i > 0; i--) // O(n)
            for (int j = 1; j <= i; j++) { // O(n)
                // for (int k = 100; k > 0; k--)
                System.out.println(i + j + 1);
                System.out.println(i + j + 2);
                // ........
            } // n^2 * 100 ~= O(n^2)
    }

    public static void main(String[] args) {
        int n = 10;
        /*
         * 1,2,3,4...... 2,4,6,8,10... 3,6,9,12....
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + ",");
            }
            System.out.println();
        }
    }

}
