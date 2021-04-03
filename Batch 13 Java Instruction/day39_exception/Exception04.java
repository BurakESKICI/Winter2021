package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception04 {
	/*
	 * E�er handle edilecek exception'lar aras�nda parent-child iliskisi varsa
	 * bu durumda child exception i�in catch blogu yazmasak da kodumuz cal�s�r
	 * Child excepiton2i silmenin 
	 * pozitif yani : tek catch blogu ile tum excepitonlar handle edilebilir
	 * negatif y�n� : bir sorunla kars�last�g�m�zda bunun dosya bulunamad�g�n�icin mi yoksa
	 * dosya okunamad�g� �c�nm� oldugu anlas�lmaz
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
		System.out.println("Kod bloke olmam�s");

	}

}
