package hw3;

import java.util.Scanner;

public class HandfulLottery {
	public static void main(String[] args) {
		int dislike = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個整數1~9之間您不喜歡的數字^^");
		if (sc.hasNextInt()) {
			dislike = sc.nextInt();
		}
		int j = 0;
		int k = 0;
		for (int i = 1; i < 50; i++) {

			if (i / 10 == dislike || i % 10 == dislike) {
				continue;

			} else {

				System.out.print(i + "\t");
				j++;
				k++;
			}
			while (k == 6) {
				System.out.print("\n");
				k = 0;
			}

		}
		System.out.println("總共有" + j + "個數字");

	}

}
