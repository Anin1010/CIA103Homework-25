package hw5;

import java.util.Scanner;

public class SquareMaker {
	public static void starSquare() {
		int width = 0;
		int height = 0;
		Scanner sc = new Scanner(System.in);
		while (width <= 0) {
			System.out.println("請輸入矩形的寬");
			if (sc.hasNextInt()) {
				width = sc.nextInt();
				if (width <= 0) {
					System.out.println("寬不可為0或負數");
				}

			}

		}
		while (height <= 0) {
			System.out.println("請輸入矩形的高");
			if (sc.hasNextInt()) {

				height = sc.nextInt();
				if (height <= 0) {
					System.out.println("高不可為0或負數");
				}
			}
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		starSquare();

	}

}
