package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception04 {
	/*
	 * Eðer handle edilecek exception'lar arasýnda parent-child iliskisi varsa
	 * bu durumda child exception için catch blogu yazmasak da kodumuz calýsýr
	 * Child excepiton2i silmenin 
	 * pozitif yani : tek catch blogu ile tum excepitonlar handle edilebilir
	 * negatif yönü : bir sorunla karsýlastýgýmýzda bunun dosya bulunamadýgýnýicin mi yoksa
	 * dosya okunamadýgý ýcýnmý oldugu anlasýlmaz
	 */

	public static void main(String[] args) {

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
		System.out.println("Kod bloke olmamýs");

	}

}
