package hw4;

public class First {
//	• 有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)
	public static void main(String[] args) {
		int[] intArray = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		double avg = sum / intArray.length;
		System.out.println("平均為" + avg);
		System.out.println("大於平均的資料為");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > avg) {
				System.out.println(intArray[i] + " ");
			}

		}

//	• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH

//		StringBuilder s1 = new StringBuilder("Hello World");
//		System.out.println(s1.reverse());
		String s = "Hello World";
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		} // length()-1 是因為 這個字串最後一個字的索引值
		System.out.println(s1);
//	(提示:String方法,陣列)
//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int sum1 = 0;
		for (int i = 0; i < planets.length; i++) {
			for (int j = 0; j < planets[i].length(); j++)
				if (planets[i].charAt(j) == 97 || planets[i].charAt(j) == 101 || planets[i].charAt(j) == 105
						|| planets[i].charAt(j) == 111 || planets[i].charAt(j) == 117) {

					sum1 = sum1 + 1;
				}

		}
		System.out.println(sum1);

	}

}
