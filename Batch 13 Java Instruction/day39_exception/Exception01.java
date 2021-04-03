package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception01 {

	public static void main(String[] args) {
		// Java'ya bir dosyayi okumas�n� veya dosyaya yazmams�n� soyled�g�m�zde 
		// Java "Ya dosyay� bulamazsam" der ve bizden ��z�m �retmemizi bekler
		//dosya bulma ile ilgili exception t�r� : FileNotFoundException 'd�r
		//Java kodu yazar yazmaz buradaki olasi problemi g�r�r ve CTE verir
		// Kodumuzu yazd�g�m�z anda ortaya c�kan bu t�r  exception'lara Checked Exceptions diyoruz
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\W4nderlust17\\eclipse-workspace\\Full Stack Automation Tester\\Batch 13 Java Instruction\\day39_exception\\File");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();   // t�m hata ac�klamalar�n� yazd�r�r ama kodumuz bloke olmaz.
			System.out.println(e.getMessage()); // daha az hata ac�klamas� yazd�r�r.
		}
		System.out.println("Kod bloke olmam�s");

	}

}
