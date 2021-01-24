package practice_08012021;

public class FindMinMax {

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 5000, 8, 20, 13, 2, 5, 1, 20 };

        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            else if (arr[i] > max)
                max = arr[i];
        }

        for (int j = 0; j < arr.length; j++) {
            var x = arr[i] - min; // המספר במערך המקורי
            var y = count[x] - 1; // מציבים את המספר X בתור אינדקס במערך העזר
            output[y] = arr[i]; // את התוצאה של Y, נציב כאינדקס במערך התוצאה
        }

        // max= 5000, min=1
    }
}
