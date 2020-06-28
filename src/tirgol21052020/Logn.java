package tirgol21052020;

public class Logn {

	/*
	 * { {1,2,3,4}, {5,6,7,8}, {12,15,17,19}, {20,25,26,28} }
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 15, 16, 20 };
		int left = 0;
		int right = arr.length - 1;

		int num = 5;
		while (true) {
			/*
			 * {1, 2, 3, 4, 5, 6, 7} 8 {,9, 10, 11, 15, 16, 20}
			 */
			if (arr[arr.length / 2] > num) {
				right = arr.length / 2;
			} else {
				if (arr[arr.length / 2] < num) {
					left = arr.length / 2;
				}
			}
			break;
		}
		// find biggest num on 2D array O(N*2)
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
//				if (arr[i][j] > max)
//					max = arr[i][j];
			}

		}

	}
}
