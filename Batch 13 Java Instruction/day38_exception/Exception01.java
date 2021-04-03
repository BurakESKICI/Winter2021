package day38_exception;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {

		// kullan�c�dan iki tam sayi alin ve bolumlerini yazd�r�nScanner 
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bolunecek sayiyi yazdirin");
		int sayi1=scan.nextInt();
		System.out.println("Lutfen kac b�lmek istedigimizi yazin");
		int sayi2=scan.nextInt();
		
		//Java exception'i handle etmek i�in try-catch blogu olusturmus.
		
		try {
		System.out.println("bolme i�leminin sonucu : "+ sayi1/sayi2);
		
		} catch (ArithmeticException e) {
			System.out.println("sayiyi sifira bolemezsin");
		}
		
		
	}

}
