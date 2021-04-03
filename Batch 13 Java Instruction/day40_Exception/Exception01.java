package day40_Exception;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk bir
		 * sayi girerse Exception verecek sekilde yazin.
		 */

		/*
		 * Scanner scan=new Scanner (System.in);
		 * System.out.println("Lutfen yaþýnýzý giriniz");
		 *  int yas=scan.nextInt();
		 * 
		 * if (yas>0) 
		 * { System.out.println("Girdiginiz yaþ : "+yas); 
		 * }else { 
		 * throw new IllegalArgumentException(); }
		 */
		//Java'ya bir exception throw ettirmek için "throw" ve "new" keywordleri kullanýlýr.
		
		
		
		// !!!þimdi yukarýdaki kodu kapatýyoruz exception ile bölünmemiþ hali olan
		// aþaðýdaki kodu yazmak için!!!

		// bu þekilde yazdýgýmýzda Java exception throw eder ama
		// kodumuz bloke olmus olur.
		// bloke olmasýný engellemek ýstersek eger try-catch ile surround yapabiliriz.

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yaþýnýzý giriniz");
		int yas = scan.nextInt();

		try {
			if (yas > 0) {
				System.out.println("Girdiginiz yaþ : " + yas);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();

		}
		System.out.println("kod bloke olmadýysa burayý görürsün");

	}

}
