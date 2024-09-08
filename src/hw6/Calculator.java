package hw6;

import java.util.Scanner;

public class Calculator {
	public int powerXY() throws CalException {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		int pow = 0;
		while (true) {
			System.out.println("請輸入x的值");

			if (sc.hasNextInt()) {
				x = sc.nextInt();
				break;
			} else {
				System.out.println("請輸入整數類型");
				sc.next();
			}

		}
		while (true) {
			System.out.println("請輸入y的值");

			if (sc.hasNextInt()) {
				y = sc.nextInt();
				if (y < 0) {

					System.out.println("次方為負數,結果回傳不為整數!");

				} else if (x == 0 && y == 0) {
					throw new CalException("0的0次方沒有意義!");
				}

				else {
					break;
				}
			}

			else {
				System.out.println("請輸入整數類型");
				sc.next();
			}

		}

		pow = (int) Math.pow(x, y);

		return pow;
	}
}
