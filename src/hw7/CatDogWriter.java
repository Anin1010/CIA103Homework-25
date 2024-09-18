package hw7;

import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CatDogWriter {
	public static void main(String[] args) {
		Pet[] pets =new Pet[4]; 
		pets [0] = new Dog("Elio");
		pets [1] = new Dog("Elio1");
		pets [2] = new Cat("Abiao");
		pets [3] = new Cat("Abiao1");
    String directoryPath = ".\\src\\files";
    File data = new File(directoryPath);
    String filePath = data+File.separator +"Object.ser";
    
   try{
	   FileOutputStream fos = new FileOutputStream(filePath);
	   ObjectOutputStream oos  = new ObjectOutputStream(fos);
	   for(int i =0;i<4;i++) {
	   oos.writeObject(pets[i]);
	   }
	   System.out.println("成功寫入 " + filePath);
	   oos.close();
	   fos.close();
   }catch(IOException e) {
	   System.out.println("傳輸錯誤");
   }
	
	
	
	
	}
}
