package day38_exception;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {

		// kullan�c�dan iki tam sayi alin ve bolumlerini yazd�r�nScanner

		int count = 1;
		Scanner scan = new Scanner(System.in);

		while (count < 100) {

			System.out.println("Lutfen bolunecek sayiyi yazdirin");
			int sayi1 = scan.nextInt();
			System.out.println("Lutfen kac b�lmek istedigimizi yazin");
			int sayi2 = scan.nextInt();
			/*
			 * Java 'ya exception'i handle etmek i�in bir c�zum �retmezsek java exception
			 * ile kars�last�g�nda cal�smay� durdurur( stops execution) throw exception (
			 * exception firlatir)( problemin kaynag�n� bize g�sterir)
			 * 
			 * tum aplication durmus olur... Musterinin kulland�g� b�r uygulama �c�n bu
			 * KABUL ED�LEMEZ .Bunun icin kod yazan ki�i muhtemel sorunlar� ongormeli ve
			 * Java'ya bu sorunla handle edebilmesi i�in yol g�stermeli
			 */

			// Java exception'i handle etmek i�in try-catch blogu olusturmus.

			try {
				System.out.println("bolme i�leminin sonucu : " + sayi1 / sayi2);

			} catch (ArithmeticException e) {
				System.out.println("sayiyi sifira bolemezsin");
			}
			System.out.println("islem no : " + count);
			count++;
		}

	}

}
