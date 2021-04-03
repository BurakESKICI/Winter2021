package day07_ýfelsestatement;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		
		//kullanýcýdan dýkdortgenýn kenar uzunluklarýný alýn 
		//uzunluklar esýt ýse kare,degýlse kare degýl yazdýr.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("dýkdortgenýn kenar uzunluklarýný gýrýnýz");
		
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		if (num1==num2) {
			System.out.println("karedir");
		
		}
		else {
			System.out.println("kare degýl");
		}
		
		scan.close();
	}

}
