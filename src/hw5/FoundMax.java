package hw5;

public class FoundMax {

	public static int maxElement(int[][] x) {
		int maxInt = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > maxInt) {
					maxInt = x[i][j];
				}
			}
		}

		return maxInt;

	}

	public static double maxElement(double[][] x) {
		double maxDouble = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > maxDouble) {
					maxDouble = x[i][j];
				}
			}
		}

		return maxDouble;
	}

	public static void main(String[] args) {
		FoundMax fm = new FoundMax();
		int intArray[][] = { { 1, 6, 3 }, { 9, 5, 2 } };
		double doubleArray[][] = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		System.out.println(fm.maxElement(intArray));
		System.out.println(fm.maxElement(doubleArray));

	}

}
