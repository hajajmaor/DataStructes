package practice_13112020;



// O(logN)

// Java implementation of iterative Binary Search
class BinarySearch {
    // Returns index of x if it is present in arr[],
    // else return -1
    int binarySearch(int arr[], int x)
    {
        int left = 0;//5=>6
        int right = arr.length - 1; // 9=>6=>5
        while (left <= right) {
            // 2 point Alon
            int middle = (left + right) / 2;// 7//6

            // Check if x is present at mid
            if (arr[middle] == x)
                return middle;

            // If x greater, ignore left half
            if (arr[middle] < x)
                left = middle + 1;
                // If x is smaller, ignore right half
            else
                right = middle - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2,5,8,12,16,23,38,56,72,91 };
        int n = arr.length;
        int x = 25;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}

