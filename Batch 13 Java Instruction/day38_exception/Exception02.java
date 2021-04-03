package day38_exception;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {

		// kullanýcýdan iki tam sayi alin ve bolumlerini yazdýrýnScanner

		int count = 1;
		Scanner scan = new Scanner(System.in);

		while (count < 100) {

			System.out.println("Lutfen bolunecek sayiyi yazdirin");
			int sayi1 = scan.nextInt();
			System.out.println("Lutfen kac bölmek istedigimizi yazin");
			int sayi2 = scan.nextInt();
			/*
			 * Java 'ya exception'i handle etmek için bir cözum üretmezsek java exception
			 * ile karsýlastýgýnda calýsmayý durdurur( stops execution) throw exception (
			 * exception firlatir)( problemin kaynagýný bize gösterir)
			 * 
			 * tum aplication durmus olur... Musterinin kullandýgý býr uygulama ýcýn bu
			 * KABUL EDÝLEMEZ .Bunun icin kod yazan kiþi muhtemel sorunlarý ongormeli ve
			 * Java'ya bu sorunla handle edebilmesi için yol göstermeli
			 */

			// Java exception'i handle etmek için try-catch blogu olusturmus.

			try {
				System.out.println("bolme iþleminin sonucu : " + sayi1 / sayi2);

			} catch (ArithmeticException e) {
				System.out.println("sayiyi sifira bolemezsin");
			}
			System.out.println("islem no : " + count);
			count++;
		}

	}

}
