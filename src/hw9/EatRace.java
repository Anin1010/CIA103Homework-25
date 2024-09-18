package hw9;

public class EatRace {
	public static void main(String[] args) {

		Eater player1 = new Eater("饅頭人");
		Thread t1 = new Thread(player1);

		Eater player2 = new Eater("詹姆士");
		Thread t2 = new Thread(player2);
		System.out.println("--------大胃王比賽開始啦--------");

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("--------大胃王比賽結束了--------");

	}
}
