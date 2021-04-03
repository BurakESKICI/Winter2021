package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {
	
	

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException ,IOException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\W4nderlust17\\eclipse-workspace\\Full Stack Automation Tester\\Batch 13 Java Instruction\\day39_exception\\File");
		
		/* Try-catch blogu exception ile handle etmekte kullan�l�r
		 * throws keyword'u ise sadece declaration'dir, dolay�s�yla 
		 * throw kullan�lan bir method'da exception olusursa KOD BLOKE OLUR.
		 * 
		 */
		
		int k =0;
		
		while ((k=fis.read())!=-1) {
			System.out.print((char)k);
		
		}
		// Eger birden fazla excepiton i�in throws keyword'u kullanacaksak
		// yazacag�m�z exception'lar aras�nda parent-child ili�kisi varsa
		//once child excepiton yaz�lmal�d�r, aksi taktirde child exception eri�ilmez olur
		
		
		// eger yazacajkalr�m�z aras�nda parent-child ili�kisi varsa 
		// istersek sadece parent'� yazmam�z da yeterli olur.
	}
	
	

}
