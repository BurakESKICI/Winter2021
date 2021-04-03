package day07_ýfelsestatement;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// kullanýcýdan ucgenýn kenar uzunluklarýný alýn
		//uc kenar esýtse "eskenar" yazdýrýn
		//yoksa "eskenar degýl" yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen ucgenýn kenarlarýný gýrýn");

		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eskenar ucgen");
		} else {System.out.println("eskenar ucgen degýl");

		}
		
		scan.close();
	}

}
