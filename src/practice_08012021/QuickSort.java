package practice_08012021;

// Java program for implementation of QuickSort 
class QuickSort {
    /*
     * This function takes last element as pivot, places the pivot element at its
     * correct position in sorted array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right of pivot
     */
    int partition(int arr[], int low, int high) {

        // { 10, 7, 8, 9, 1, 5 };
        // { 1, 7, 8, 9, 10, 5 };
        int pivot = arr[high]; // 5
        int i = (low - 1); // index of smaller element -1
        for (int j = low; j < high; j++) { // 0-6 size of array
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++; // 0

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // { 1, 7, 8, 9, 10, 5 };
        // swap arr[i+1] and arr[high] (or pivot)
        // i=0
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        // { 1, 5, 8, 9, 10, 7 };
        return i + 1; // 1
    }

    /*
     * The main function that implements QuickSort() arr[] --> Array to be sorted,
     * low --> Starting index, high --> Ending index
     */
    void sort(int arr[], int low, int high) {
        if (low < high) {
            /*
             * pi is partitioning index, arr[pi] is now at right place
             */
            int pi = partition(arr, low, high); // 1

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);// 0-0
            sort(arr, pi + 1, high); // 2-7 גודל המערך
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);

        System.out.println("sorted array");
        printArray(arr);
    }
}
/* This code is contributed by Rajat Mishra */
