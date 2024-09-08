package hw1;

public class Ans {
	public static void main(String[] args) {
//		•請設計一隻Java程式,計算12,6這兩個數值的和與積
		int sum, product;
		sum = 12 + 6;
		product = 12 * 6;
		System.out.println("和為" + sum);
		System.out.println("積為" + product);
//		• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int dozen, eggs;
		dozen = 200 / 12;
		eggs = 200 % 12;
		System.out.println("200顆蛋一共是" + dozen + "打並剩" + eggs + "顆");
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int days;
		int hours;
		int mins;
		int secs;
		int oneDaySecs;
		int oneHourSecs;
		oneDaySecs = 60 * 60 * 24;
		oneHourSecs = 60 * 60;
		days = 256559 / oneDaySecs;
		hours = (256559 - days * oneDaySecs) / (oneHourSecs);
		mins = (256559 - days * oneDaySecs - hours * oneHourSecs) / 60;
		secs = (256559 - days * oneDaySecs - hours * oneHourSecs - mins * 60);
		System.out.println(days + "天" + hours + "小時" + mins + "分" + secs + "秒");
//		• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		double rad = 5;
		double dia = 2 * rad;
		double area = rad * rad * PI;
		double cir = dia * PI;
		System.out.println("圓面積為" + area + "圓周長為" + cir);

//		• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google) A = P (1 + r/n)^(nt)
		double p = 1500000.0;
		for (int i = 0; i < 10; i++) {
			p = p * 1.02;
		}
		System.out.println(p);
//		• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		System.out.println(5 + 5);
		// 資料型態皆為int,所以可以運算相加得10
		System.out.println(5 + '5');
		// 字元'5'在unicode中排列為0035換算十進制的值為53,所以答案=5+53=58
		System.out.println(5 + "5");
		// 資料型態為int和String,字串若與整數相加則為串接相加,所以答案=55

	}

}
