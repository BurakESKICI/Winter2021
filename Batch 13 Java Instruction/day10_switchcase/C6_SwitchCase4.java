package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullanýcýdan VIP (very important person )kýsaltmasýnda hangi harfin anlamýný istedigini soralým 
		//girilen harfin acýklamasýný yazdýralým 
		// KOD 1 ;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen V.I.P.harflerýnden birini giriniz");
		
		char harf=scan.next().toUpperCase().charAt(0);
		
		
		switch (harf) {
		
		case 'V':
			System.out.println("very");
			break;
		case 'I':
			System.out.println("important");
			break;
		case 'P':
			System.out.println("person");
			break;

		default:
			System.out.println("lutfen VIP harflerýnden býrýný gýrýnýz");
			break;
		 }
		
		// burada ise kullanýcý birden fazla harf girerse çalýsmýycaktýr :) 
		// KOD 2 ;
		System.out.println("lutfen harf gýrýnýz");

		String str=scan.next().toUpperCase();
		
		
		switch (str) {
		
		case "V":
			System.out.println("very");
			break;
		case "I":
			System.out.println("important");
			break;
		case "P":
			System.out.println("person");
			break;

		default:
			System.out.println("lutfen VIP harflerýnden býrýný gýrýnýz");
			break;
		 }
		
		
		
		
		
scan.close();
	}

}
