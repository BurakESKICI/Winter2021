package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

	public static void main(String[] args) {
		/*
		 E�er kodumuz yazd�g�m�zda birden fazla exception'la iliskili durum olusturuyorsa
		 Icice try-catch bloklari olusturab�l�r�z
		 Bu �rnekte ilk �nce dosyay� okutmak istedik 
		 Java " ya dosyay� bulamazsam? " diye bizden yard�m istedi
		 Biz De try-catch blogu ile FileNotFoundException ile handle etmesinde yard�mc� olduk
		 Sonra dosyadaki yaz�lar� okumaya cal�st�k ve Java yeniden "Ya dosyay� okuyamazsam" 
		 diyeyard�m istedi
		 Biz de try-catch ile IOException ile handle etmesini saglad�k
		 
		 */
		
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\W4nderlust17\\eclipse-workspace\\Full Stack Automation Tester\\Batch 13 Java Instruction\\day39_exception\\File");
		int k =0;
		try {
			while ((k=fis.read())!=-1) {
				System.out.print((char)k);
			}
		} catch (IOException e) {   // dosyalarla ilgili genel yazma ve okuma sorunlar� ile handle eder
			
			e.printStackTrace();
		}
		
		
		
		} catch (FileNotFoundException e) {
			
			
			System.out.println(e.getMessage()); 
		}
		System.out.println("");
		System.out.println("Kod bloke olmam�s");
		
		
		
		
		

	}

}
