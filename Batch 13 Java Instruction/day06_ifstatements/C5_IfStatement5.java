package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		
		//kullanýcýdan bir dikdörtgenýn ýký kenar uzunlugunu alýn  
		//kenar uzunluklarý esýtse kare degýlse dýkdortgen yazdýrýn
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen 2 kenar uzunlugunu giriniz");
		
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
      
		if (kenar1 == kenar2) {
			System.out.println("bu bir karedir");
		}
		
		if (kenar1!= kenar2) {
			System.out.println("bu bir dikdörtgendir");
		}
		
		
		//burasýda tamamdýr.
		
		
    scan.close();
	}

}
