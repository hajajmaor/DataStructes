package tirgol2;

public class Sibohiut {

    static void func1() {
        // O(3)
        int a;
        a = 5;
        System.out.println(a);
    }

    static void func2(int[] arr, int num) {
        // arr={1,2,...6}, length = 6
        // מציאת מספר והדפסת אינדקס
        // 2 + n + n + n + 1 = O(3n+3) ~=O(n)
        // O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("index of " + num + " is: " + i);
                // break; - במידה והמספר נמצא ייצא מהלולאה אבל ימשיך את הפונקציה
                return; // ישבור את הפונקציה ויחזור לתוכנית שקראה לו.
            }
        }

        System.out.println(num + " not found in array given.");
    }

    static void fillMatrix(int[][] matrix) {
        // 2* O(n*m) ~= O(n*m)

        // נקודת הנחה - המערך דו מימדי יהיה בגודל N*M

        // O(n*m)
        for (int i = 0; i < matrix.length; i++) {// O(n)
            for (int j = 0; j < matrix[0].length; j++) { // O(n)
                matrix[i][j] = (i + 1) * (j + 1); // O(1)
            }
        }
        // O(n*m)
        for (int i = 0; i < matrix.length; i++) {// O(n)
            for (int j = 0; j < matrix[0].length; j++) {// O(n)
                System.out.print(matrix[i][j] + ",");// O(1)
            }
            System.out.println();// O(1)
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[20][20];
        fillMatrix(matrix);
    }
}