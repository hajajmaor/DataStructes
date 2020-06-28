package tirgol2;

import java.util.Arrays;

public class Recursia {

	/*
	 * 1*2*3*4*5 num=5
	 */
	static int factorial(final int num) {
		if (num <= 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}

	}

	/*
	 * [1,2,3,4,5,6] num=3 arr[0] == ?????? return 0 [2,3,4,5,6] - Arr[0] = 2
	 * 
	 */
	static int getAnIndexrecursia(int[] arr, int num) {
		int index = 0;
		if (arr.length == 0) {
			return -1;
		} else {
			if (arr[0] == num) {
				index = 0;
			} else {
				index++;
				int[] subarray = Arrays.copyOfRange(arr, 1, arr.length);
				if (getAnIndexrecursia(subarray, num) == -1) {
					return -1;
				} else {
					index++;
				}
			}
		}
		return index;
	}

	// מציאת אינדקס למספר במערך
	static int getAnIndex(final int[] arr, final int num) {

		// O(n/2) o(1)
		// length 5
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] == num)
				return i;
			else {
				if (arr[arr.length - 1 - i] == num)
					return arr.length - 1 - i;
			}
		}
		// אם המספר לא נמצא במערך, נחזיר -1
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int num = 3;
		System.out.println("" + getAnIndexrecursia(arr, num));
	}

}
