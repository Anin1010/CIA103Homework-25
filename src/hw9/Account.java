package hw9;

public class Account {

	private static int balance;
	private static int withDrawedTimes;
	private static int remitedTimes;

	public Account(int balance) {
		this.balance = balance;
	}
	synchronized public void receive(int amount, String name) {
		while (balance > 3000) {
			System.out.println(name + "餘額超過3000，停止匯款");
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(name + "被要求匯款");
		}
		balance += amount;
		remitedTimes++;

		System.out.println(name + "存了" + amount + "元，帳戶共有" + balance + "元,這是第" + remitedTimes + "次匯款");
		notify();
	}

	synchronized public void withdraw(int amount, String name) {
		while (balance < amount) {
			System.out.println(name + "看到餘額在" + amount + "以下，不領錢");
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(name + "被老媽通知已匯款");
		}
		balance -= amount;
		withDrawedTimes++;

		System.out.println(name + "領了" + amount + "元，帳戶共有" + balance + "元,這是第" + withDrawedTimes + "次提款");
		if (balance < 2000) {
			notify();
			System.out.println(name + "沒錢了,要求老媽匯款");
		}

	}
}

class Remitter extends Thread {
	private String name;
	private Account Account;

	public Remitter(String name, Account Account) {
		this.name = name;
		this.Account = Account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			Account.receive(1000, name);
		}
	}
}

class Payee extends Thread {
	private String name;
	private Account Account;

	public Payee(String name, Account Account) {
		this.name = name;
		this.Account = Account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			Account.withdraw(1000, name);
		}
	}
}


