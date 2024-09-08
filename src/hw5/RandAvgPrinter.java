package hw5;

public class RandAvgPrinter {
	public void randAvg() {
		int num[] = new int[10];
		int sum = 0;
		int ran = 0;
		double avg = 0;
		System.out.println("本次亂數結果:");
		for (int i = 0; i < num.length; i++) {
			ran = (int) (Math.random() * 100) + 1;
			num[i] = ran;
			sum += num[i];

			System.out.print(+num[i] + " ");
		}
		avg = sum / num.length;
		System.out.println("\n" + "平均為:" + avg);
	}

	public void main(String[] args) {
		randAvg();
	}
}
