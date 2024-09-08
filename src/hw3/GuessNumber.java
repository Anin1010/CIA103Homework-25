package hw3;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {

		int answer;
		int guess = 0;
		answer = (int) (Math.random() * 101);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("請猜一個數字(0~100之間的整數)");
		while (true) {
			if (sc1.hasNextInt()) {
				guess = sc1.nextInt();
				if (guess < 0) {
					System.out.println("請輸入0~100之間的整數");
				} else if (guess == answer) {
					System.out.println("恭喜答對!!");
					break;
				} else if (guess > answer) {
					System.out.println(guess + "比答案大喔!");
				} else if (guess < answer) {
					System.out.println(guess + "比答案小喔!");
				}
			}
			else {
				System.out.println("請輸入數字!!");
				break;
			}

		}
	}

}
