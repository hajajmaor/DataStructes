package practice_27112020;

public class Targil1 {
	// {1,2,3,4,5,6,7,8,9} union {4,5,6,7,10,11} = {1,2,3,4,0,6,7,8,9,10,11,0 ,0 ,0
	// ,0 ,0}
	// resultArr = {1,2,3,4,0,6,7,8,9,10,11}
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 0, 6, 7, 8, 9 };
		System.out.println("arr1:");
		printArr(arr1);

		int[] arr2 = { 4, 0, 6, 7, 10, 11 };
		System.out.println("arr2:");
		printArr(arr2);

		int[] unionArr = union(arr1, arr2);
		System.out.println("result of union:");
		printArr(unionArr);
	}

	// tmp = {1,2,3,4,5,6,7,8,9}
	public static int[] union(int[] arr1, int[] arr2) {
		int[] tmp = new int[arr1.length + arr2.length];

		// copy all elements from arr1 into tmp
		int i;
		for (i = 0; i < arr1.length; i++)
			tmp[i] = arr1[i];

		for (int j = 0; j < arr2.length; j++) {
			int current = arr2[j];
			// look for current in arr1
			int k;
			for (k = 0; k < arr1.length; k++) {
				if (current == arr1[k])
					break; // step out of k loop
			}
			if (k == arr1.length) // current not found in arr1
				tmp[i++] = current;

		}

		int[] resultArr = new int[i]; // create arr with correct length

		// copy elements from tmp to resultArr
		for (int index = 0; index < resultArr.length; index++)
			resultArr[index] = tmp[index];

		// return union of arr1 and arr2
		return resultArr;
	}

	public static void printArr(int[] arr) {
		// for (int i=0; i<arr.length; i++)
		// System.out.print(arr[i] + " ");

		for (int item : arr)
			System.out.print(item + " ");

		System.out.println();

	}

}
