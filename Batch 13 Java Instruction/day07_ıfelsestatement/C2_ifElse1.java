package day07_�felsestatement;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		
		//kullan�c�dan d�kdortgen�n kenar uzunluklar�n� al�n 
		//uzunluklar es�t �se kare,deg�lse kare deg�l yazd�r.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("d�kdortgen�n kenar uzunluklar�n� g�r�n�z");
		
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		if (num1==num2) {
			System.out.println("karedir");
		
		}
		else {
			System.out.println("kare deg�l");
		}
		
		scan.close();
	}

}
