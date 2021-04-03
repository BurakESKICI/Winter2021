package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		
		//kullanýcýdan gün isminin ilk harfini isteyin ve harfe uygun olan gun 
		//isimlerini yazdýrýn
		//kullanýcý c girerse cuma veya cumartesý gýbý 
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Gün isminin ilk harfini giriniz");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		//bu satir itibariyle girilen String'in ilk karakterini almýs oldum.
		
		//p , s , c 
		
		if (ilkHarf=='p' || ilkHarf=='P') {
			System.out.println("pazar,pazartesi,perþembe");
		}
		
		if (ilkHarf=='s' || ilkHarf=='S') {
			System.out.println("salý");
		}
		
		if (ilkHarf=='c' || ilkHarf=='C') {
			System.out.println("carsamba,cumartesi,cuma");
		}
		
		
		if (ilkHarf!='c' && ilkHarf!='C' && ilkHarf!='p'  && ilkHarf!='P' && ilkHarf!='s' && ilkHarf!='S') {
			System.out.println("maalesef yazdýgýnýz harf ile ilgili gün bulunamamýstýr!");
		}
		
		
		
     scan.close();
	}

}
