package hw9;

public class Eater implements Runnable {
	private String name;
	private int bowls;

	public Eater(String name) {
		this.name = name;
	}

	private void eat() throws InterruptedException {
		System.out.println(name + "吃第" + bowls + "碗飯");
		Thread.sleep((long) (Math.random() * 2500 + 500));
		bowls++;
	}

	public void run() {
		while (bowls <= 10) {
			try {
				eat();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了");
	}
}