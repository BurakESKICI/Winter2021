package day07_�felsestatement;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// kullan�c�dan ucgen�n kenar uzunluklar�n� al�n
		//uc kenar es�tse "eskenar" yazd�r�n
		//yoksa "eskenar deg�l" yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen ucgen�n kenarlar�n� g�r�n");

		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eskenar ucgen");
		} else {System.out.println("eskenar ucgen deg�l");

		}
		
		scan.close();
	}

}
