package hw3;

import java.util.Scanner;

public class TriJudg {
	public static void main(String[] args) {
//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形
		int a=0;
		int b=0;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
			System.out.println("請輸入數字");
		}
		if (sc.hasNextInt()) {
			b = sc.nextInt();
			System.out.println("請輸入數字");
		}
		if (sc.hasNextInt()) {
			c = sc.nextInt();
		}
		
		
			if(a<=0||b<=0||c<=0) {
                System.out.println("無法組成三角形,請確認數字");
            }
			else if(a+b<=c||b+c<=a||c+a<=b) {
                System.out.println("無法組成三角形,請確認數字");
            }
			else if(a>0&&a==b&&c==a ) {
                System.out.println("正三角形");
                }
			else if(a>0&&a==b||c==a||b==c) {
				System.out.println("等腰三角形");
			}
			else if(a*a+b*b==c*c) {
				System.out.println("直角三角形");
			}
			else {
				System.out.println("其他三角形");
			}
			
	}
}
