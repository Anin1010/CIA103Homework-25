package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RandomWriter {
	public static void main(String args[]) {
		int randomArray[] = new int[10];
		int i;
		for (i = 0; i < (randomArray.length ); i++) {
			randomArray[i] += ((Math.random() * 1000) + 1);
		}

		try {
			FileWriter fw = new FileWriter(".\\src\\files\\Data.txt", true);

			BufferedWriter bw = new BufferedWriter(fw);

			PrintWriter pw = new PrintWriter(bw);
			for (i = 0; i < (randomArray.length ); i++) {
				int count = 1;
				count += i;
				pw.print("第"+count+"個亂數"+randomArray[i]+" "+"\n");
				
			}
			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
