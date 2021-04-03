package day10_switchcase;

import java.util.Scanner;


public class C1_TerneryOperator {

	public static void main(String[] args) {
		
		// Soru5 ) Kullanicidan bir sayi alin ve sayi 3 basamakli ise 
		//“uc basamakli sayi”, yoksa  “Uc  basamakli degil” yazdirin

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		
		double sayi=scan.nextDouble();
		
		String sonuc= ((sayi>99 && sayi<1000 ) || (sayi>-1000 && sayi<-99)) ?
				"uc basamaklı sayi" : "sayı uc basamakli degil";
		
		System.out.println(sonuc);
		
		scan.close();
	}

}
