package practice_27112020;

// add two matrices
public class Targil2 {

	public static void main(String[] args) {
		int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("m1:");
		printMatrix(m1);

		int[][] m2 = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		System.out.println("m2:");
		printMatrix(m2);

		int[][] plusMatrix = plus(m1, m2);
		System.out.println("plus result:");
		printMatrix(plusMatrix);
	}

	private static int[][] plus(int[][] m1, int[][] m2) {
		// verify dimensions are identical
		if (m1.length != m2.length || m1[0].length != m2[0].length)
			return null;
		else {
			int[][] resultMatrix = new int[m1.length][m1[0].length];
			for (int i = 0; i < resultMatrix.length; i++)
				for (int j = 0; j < resultMatrix[i].length; j++)
					resultMatrix[i][j] = m1[i][j] + m2[i][j];
			return resultMatrix;
		}
	}

	private static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}

}
