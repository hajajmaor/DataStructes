package preTest2020;

import java.util.Arrays;
import java.util.Random;

public class MissingNumber {
    static final int maxSize = 30;
    static int realSize;

    static void unsortArr(int[] arr) {
        var random = new Random();
        for (int i = 0; i < arr.length; i++) {
            var randomIndex = random.nextInt(arr.length);
            var temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }

    public static void main(String[] args) {
        var random = new Random();
        realSize = random.nextInt(maxSize);
        int randomNumToDelete = random.nextInt(realSize);
        int[] arr = new int[realSize - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < randomNumToDelete)
                arr[i] = i + 1;
            else
                arr[i] = i + 2;
        }
        // default sort array with a hole
        System.out.println(Arrays.toString(arr));
        unsortArr(arr);
        // array unsorted
        System.out.println(Arrays.toString(arr));
    }
}