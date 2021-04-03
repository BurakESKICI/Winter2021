package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {
	
	

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException ,IOException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\W4nderlust17\\eclipse-workspace\\Full Stack Automation Tester\\Batch 13 Java Instruction\\day39_exception\\File");
		
		/* Try-catch blogu exception ile handle etmekte kullanýlýr
		 * throws keyword'u ise sadece declaration'dir, dolayýsýyla 
		 * throw kullanýlan bir method'da exception olusursa KOD BLOKE OLUR.
		 * 
		 */
		
		int k =0;
		
		while ((k=fis.read())!=-1) {
			System.out.print((char)k);
		
		}
		// Eger birden fazla excepiton için throws keyword'u kullanacaksak
		// yazacagýmýz exception'lar arasýnda parent-child iliþkisi varsa
		//once child excepiton yazýlmalýdýr, aksi taktirde child exception eriþilmez olur
		
		
		// eger yazacajkalrýmýz arasýnda parent-child iliþkisi varsa 
		// istersek sadece parent'Ý yazmamýz da yeterli olur.
	}
	
	

}
