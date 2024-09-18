package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CatDogReader {
	public static void main(String[] args) throws ClassNotFoundException {

		try {
			FileInputStream fis = new FileInputStream(".\\src\\files\\Object.ser");

			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				while (true) {
					((Pet) ois.readObject()).speak();
					System.out.println("--------------------");
				}
			} catch (EOFException e) {
				System.out.println("資料讀取完畢！");
			}
			ois.close();
			fis.close();

		} catch (IOException a) {
			a.printStackTrace();
		}

	}

}
