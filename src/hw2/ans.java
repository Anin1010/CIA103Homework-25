package hw2;

public class ans {
//	• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i <= 1000) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int product = 1;

		for (int i1 = 1; i1 < 11; i1++) {
			product *= i1;

		}
		System.out.println(product);
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int i2 = 1;
		int product1 = 1;
		while (i2 <= 10) {
			product1 *= i2;
			i2++;
		}
		System.out.println(product1);

//	• 請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100
		for (int i3 = 1; i3 < 11; i3++) {
			System.out.print(i3 * i3 + " ");
		}
		System.out.print("\n");

//	• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

		int times = 0;
		for (int i4 = 1; i4 <= 49; i4++) {
			if (i4 % 10 != 4) {
				if (i4 < 40) {
					System.out.print(" " + i4 + "\t");
					times++;
				}

			}

		}
		System.out.println();
		System.out.println("總共有" + times + "個");
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
//	
		for (int i5 = 0; i5 < 10; i5++) {

			for (int j = 1; j <= 10 - i5; j++) {

				System.out.print(j + " ");

			}
			System.out.println();

		}

//	• 請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		for (int i6 = 65; i6 < 71; i6++) {
			char eng = 0;
			eng += i6;
			for (char j = 65; j <= i6; j++) {

				System.out.print(eng);

			}
			System.out.println();

		}
	}
}