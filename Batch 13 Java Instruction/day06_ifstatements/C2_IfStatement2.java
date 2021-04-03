package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		// kullanýcýdan bir sayý isteyin ve sayýnýn tek veya çift sayý oldugunu yazdýrýn.
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("lütfen bir tam sayý giriniz");
        
		
		int num=scan.nextInt();
		
		
		if (num%2==0) {
			System.out.println("girdiðiniz sayý çift sayýdýr.");
		}
		
		if (num%2!=0) {
			System.out.println("girdiðiniz sayý tek sayýdýr.");
		}
		
		System.out.println("katýldýðýnýz için teþekkürler.");
		
		
	
		scan.close();
	}

}
