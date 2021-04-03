package day39_exception;

import java.util.Scanner;

public class Excepiton08Soru {

	public static void main(String[] args) {

		/*
		 * 
		 * Kullanicidan carpma yapmak icin bir String isteyin. Kullanicinin girdigi
		 * String sadece sayilardan olusuyorsa sayiyi 2 ile carpip sonucu yazdirin.
		 * Kullanici sayilardan olusmayan bir String girerse “Girdiginiz String sayiya
		 * cevrilemez” yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 2 ile çarpmak için String girin");
		String str = scan.nextLine();
		
        try {
        	System.out.println(2 * Integer.parseInt(str)); // 2 sayý yazýp arasýnda bosluk býraktýgýmda
			// NumberFormatException bunu veririr
		} catch (NumberFormatException e) {
			System.out.println("Girdiginiz String sayiya cevrilmez");
		}
		
	}

}
