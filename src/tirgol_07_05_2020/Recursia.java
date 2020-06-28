package tirgol_07_05_2020;

public class Recursia {
	// 1. sum of array +
	// 2. sum of array *
	// 3. polindrom (abba, abcba)
	// 4. factorial (עצרת)

	static int sumOfArrayPlus(int[] nums, int index) {
		if (index < 0)
			return 0;
		else {
			return nums[index] + sumOfArrayPlus(nums, index - 1);
		}
	}

	static int sumOfArrayTimes(int[] nums, int index) {
		if (index == nums.length)
			return 1;
		else {
			return nums[index] * sumOfArrayTimes(nums, index + 1);
		}
	}

	static int factorial(int num) {
		// 3!=1*2*3 =6
		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);// 3*2*1 == 1*2*3
		}

	}

	public static void main(String[] args) {
		int[] nums = { 2, 4, 6, 8, 10 };
		/// חיבור
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			counter += nums[i];
		}
		System.out.println(counter == sumOfArrayPlus(nums, 0));

		/// כפל
		counter = 1;
		for (int i = 0; i < nums.length; i++) {
			counter *= nums[i];
		}
		System.out.println(counter == sumOfArrayTimes(nums, 0));

	}

}
