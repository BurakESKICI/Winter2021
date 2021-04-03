package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception01 {

	public static void main(String[] args) {
		// Java'ya bir dosyayi okumasýný veya dosyaya yazmamsýný soyledýgýmýzde 
		// Java "Ya dosyayý bulamazsam" der ve bizden çözüm üretmemizi bekler
		//dosya bulma ile ilgili exception türü : FileNotFoundException 'dýr
		//Java kodu yazar yazmaz buradaki olasi problemi görür ve CTE verir
		// Kodumuzu yazdýgýmýz anda ortaya cýkan bu tür  exception'lara Checked Exceptions diyoruz
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\W4nderlust17\\eclipse-workspace\\Full Stack Automation Tester\\Batch 13 Java Instruction\\day39_exception\\File");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();   // tüm hata acýklamalarýný yazdýrýr ama kodumuz bloke olmaz.
			System.out.println(e.getMessage()); // daha az hata acýklamasý yazdýrýr.
		}
		System.out.println("Kod bloke olmamýs");

	}

}
