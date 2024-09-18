package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPrinter {
	public static void main(String[] args) throws IOException {
CopyPrinter.copyFile(".\\src\\files\\sample","C:\\CIA103_Workspace\\Homework-25\\src\\files\\Data.txt");

	}

	public static void copyFile(String a, String b) throws IOException {

		File inputFile = new File(a);
		File outputFile = new File(b);

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int word;

		while ((word = in.read()) != -1) {
			out.write(word);
			System.out.print((char) word);
			System.out.flush();
		}

		in.close();
		out.close();

	}

}
