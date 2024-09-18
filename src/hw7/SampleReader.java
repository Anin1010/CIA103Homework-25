package hw7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SampleReader {
	public static void main(String args[]) {

		try {
			long bytes = Files.size(Paths.get(".//src//files//sample"));
			System.out.println("sample.txt 檔案共有 " + bytes + " 個位元組");
		} catch (IOException e) {
			System.out.println("無法讀取檔案");
		}
		try (BufferedReader reader = new BufferedReader(
		new FileReader(".//src//files//sample"))) {
			int charCount = 0;
			int lineCount = 0;
			String line;

			while ((line = reader.readLine()) != null) {
				lineCount++;
				charCount += line.length(); 
			}

			System.out.println("sample.txt 檔案共有 " + charCount + " 個字元");
			System.out.println("sample.txt 檔案共有 " + lineCount + " 列資料");
		} catch (IOException e) {
			System.out.println("發生錯誤");
		}
	}
}
