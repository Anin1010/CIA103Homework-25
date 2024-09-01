package hw4;

import java.util.Scanner;

public class LendMeMoney {
	public static void main(String[] args) {
		int sum = 0;
		int lend = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入要借的金額");
		if (sc.hasNextInt()) {
			lend = sc.nextInt();
		}
		System.out.println("有錢可借的員工編號:");
		int xx[][] = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		for (int i = 0; i < xx.length; i++) {

			if (lend <= xx[i][1]) {
				sum++;
				System.out.println(xx[i][0]);
			}

		}

		System.out.println("總共有" + sum + "人");
	}
}
