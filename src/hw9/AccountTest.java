package hw9;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(0);
		Remitter mom = new Remitter("老媽", account);
		Payee son = new Payee("熊大", account);
		mom.start();
		son.start();
		try {
			mom.join();
			son.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("帳戶操作已結束");
	}
}
