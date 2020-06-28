package tirgol21052020;

// Counting sort which takes negative numbers as well  
import java.util.*;

class CountingSort {

	static int[] countSort(int[] arr) {
		// O(n+k) ~O(4n+k)+4
		int max = Arrays.stream(arr).max().getAsInt();// the max number O(n)
		int min = Arrays.stream(arr).min().getAsInt();// the min number O(n)
		int range = max - min + 1;// 20 (max) - 5(min)=15 +1 = [16]
		int count[] = new int[range];// counter array
		int output[] = new int[arr.length];// final array

		for (int i = 0; i < arr.length; i++) {// add 1 to every index in counter array O(n)
			count[arr[i] - min]++;
		}

		// O(K) K is unknown
		for (int i = 1; i < count.length; i++) { // fill the blanks in the array O(K) K is unknown
			count[i] += count[i - 1];
		}

		for (int i = arr.length - 1; i >= 0; i--) {// O(n)
			output[count[arr[i] - min] - 1] = arr[i];
			count[arr[i] - min]--;
		}

//		for (int i = 0; i < arr.length; i++) {// reset original array pointer
//			arr[i] = output[i];
//		}
		return output;

	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	// Driver code
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 8, 7, 2, 5, 1000, 5, 7, 6 };
		arr = countSort(arr);
		printArray(arr);
	}
}

// This code is contributed by princiRaj1992 
