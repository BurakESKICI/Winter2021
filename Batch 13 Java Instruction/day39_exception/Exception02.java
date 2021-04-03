package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

	public static void main(String[] args) {
		/*
		 Eðer kodumuz yazdýgýmýzda birden fazla exception'la iliskili durum olusturuyorsa
		 Icice try-catch bloklari olusturabýlýrýz
		 Bu örnekte ilk önce dosyayý okutmak istedik 
		 Java " ya dosyayý bulamazsam? " diye bizden yardým istedi
		 Biz De try-catch blogu ile FileNotFoundException ile handle etmesinde yardýmcý olduk
		 Sonra dosyadaki yazýlarý okumaya calýstýk ve Java yeniden "Ya dosyayý okuyamazsam" 
		 diyeyardým istedi
		 Biz de try-catch ile IOException ile handle etmesini sagladýk
		 
		 */
		
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\W4nderlust17\\eclipse-workspace\\Full Stack Automation Tester\\Batch 13 Java Instruction\\day39_exception\\File");
		int k =0;
		try {
			while ((k=fis.read())!=-1) {
				System.out.print((char)k);
			}
		} catch (IOException e) {   // dosyalarla ilgili genel yazma ve okuma sorunlarý ile handle eder
			
			e.printStackTrace();
		}
		
		
		
		} catch (FileNotFoundException e) {
			
			
			System.out.println(e.getMessage()); 
		}
		System.out.println("");
		System.out.println("Kod bloke olmamýs");
		
		
		
		
		

	}

}
