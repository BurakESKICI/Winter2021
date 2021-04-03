package day38_exception;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {

		// kullanýcýdan iki tam sayi alin ve bolumlerini yazdýrýnScanner 
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bolunecek sayiyi yazdirin");
		int sayi1=scan.nextInt();
		System.out.println("Lutfen kac bölmek istedigimizi yazin");
		int sayi2=scan.nextInt();
		
		//Java exception'i handle etmek için try-catch blogu olusturmus.
		
		try {
		System.out.println("bolme iþleminin sonucu : "+ sayi1/sayi2);
		
		} catch (ArithmeticException e) {
			System.out.println("sayiyi sifira bolemezsin");
		}
		
		
	}

}
