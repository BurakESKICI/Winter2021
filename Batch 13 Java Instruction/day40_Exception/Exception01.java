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
		 * System.out.println("Lutfen ya��n�z� giriniz");
		 *  int yas=scan.nextInt();
		 * 
		 * if (yas>0) 
		 * { System.out.println("Girdiginiz ya� : "+yas); 
		 * }else { 
		 * throw new IllegalArgumentException(); }
		 */
		//Java'ya bir exception throw ettirmek i�in "throw" ve "new" keywordleri kullan�l�r.
		
		
		
		// !!!�imdi yukar�daki kodu kapat�yoruz exception ile b�l�nmemi� hali olan
		// a�a��daki kodu yazmak i�in!!!

		// bu �ekilde yazd�g�m�zda Java exception throw eder ama
		// kodumuz bloke olmus olur.
		// bloke olmas�n� engellemek �stersek eger try-catch ile surround yapabiliriz.

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ya��n�z� giriniz");
		int yas = scan.nextInt();

		try {
			if (yas > 0) {
				System.out.println("Girdiginiz ya� : " + yas);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();

		}
		System.out.println("kod bloke olmad�ysa buray� g�r�rs�n");

	}

}
