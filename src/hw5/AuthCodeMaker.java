package hw5;

public class AuthCodeMaker {
	public  static void genAuthCode(){
		String charPool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String codePool ="";
		for (int i = 0; i < 7; i++) {
			int j = (int) (Math.random() * 62);
			codePool += charPool.charAt(j);
		}
		System.out.print(codePool);

	}
	public static void  main(String[] args) {
		AuthCodeMaker code = new AuthCodeMaker();
		code.genAuthCode();
	}
}
