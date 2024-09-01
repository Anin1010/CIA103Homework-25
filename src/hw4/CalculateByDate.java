package hw4;

import java.util.Scanner;

public class CalculateByDate {
	public static void main(String[] args) {

		int input[] = new int[3];
		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner sc1 = new Scanner(System.in);
		System.out.println("請輸入西元年分");
		if (sc1.hasNextInt()) {
			input[0] = sc1.nextInt();
		}
		System.out.println("請輸入月份");
		if (sc1.hasNextInt()) {
			input[1] = sc1.nextInt();
		}
		System.out.println("請輸入日期");
		if (sc1.hasNextInt()) {
			input[2] = sc1.nextInt();
		}
		if (input[0] <= 0) {
			System.out.println("請確認是否輸入正確");
		}
		if (input[1] <= 0 || input[1] > 12) {
			System.out.println("請確認是否輸入正確");
		}
		if (input[2] <= 0 || input[2] > 31) {
			System.out.println("請確認是否輸入正確");
		}
		if (input[1] == 2 && input[2] > 29) {
			System.out.println("請確認是否輸入正確");
		}
		if ((input[0] / 4 == 0 && input[0] / 100 != 0) || input[0] / 400 == 0) {
			days[1] = 29;
		}
		int sum = 0;
//		for (int i = input[1] - 1; i > 0; i--) {
//			sum += days[i];
//		}
		for (int i = 0; i < input[1] - 1; i++) {
			sum += days[i];

		}
		sum = sum + input[2];
		System.out.println("這天是當年的第" + sum + "天");

	}
}