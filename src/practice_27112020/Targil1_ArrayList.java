package practice_27112020;

import java.util.ArrayList;

public class Targil1_ArrayList {
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
		// int[] tmp = new int[arr1.length + arr2.length];
		ArrayList<Integer> tmpAL = new ArrayList<Integer>();

		// copy all elements from arr1 into tmp
		for (int item : arr1)
			tmpAL.add(item);

		for (int j = 0; j < arr2.length; j++) {
			int current = arr2[j];
			if (!tmpAL.contains(current))
				tmpAL.add(current);
		}

		int[] resultArr = new int[tmpAL.size()];
		for (int i = 0; i < tmpAL.size(); i++)
			resultArr[i] = tmpAL.get(i);

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
