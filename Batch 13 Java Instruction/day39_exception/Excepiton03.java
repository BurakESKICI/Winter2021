package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excepiton03 {

	public static void main(String[] args) {
		// i� i�e try-catch yerine 
		//1 tane try ve multiple catch blogu kullanab�l�r�z 
		//Ancak bu durumda yazd�g�m�z exceptionlar aras�nda Parent-Child ili�kisi varsa
		//�nce child class'� yazmall�y�z.
		// Aksi takdirde (yani �nce parent yaz�l�rsa ) child'a i� kalmaz
		// Java eri�ilemez catch -blogu diyerek CTE verir
		
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\W4nderlust17\\eclipse-workspace\\Full Stack Automation Tester\\Batch 13 Java Instruction\\day39_exception\\File");
		int k =0;
		
			while ((k=fis.read())!=-1) {
				System.out.print((char)k);
			}
		} catch (FileNotFoundException e) {  
			
			e.printStackTrace();
		
		
		
		
		} catch (IOException e) {
			
			
			System.out.println(e.getMessage()); 
		}
		System.out.println("");
		System.out.println("Kod bloke olmam�s");
		

	}

}
