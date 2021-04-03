package day07_ýfelsestatement;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// kullanýcýdan iki sayi isteyin
		//sayýlarýn ýkýsý de pozýtýf ýse sayýlarýn toplamý yazdýrýn
	    //sayýlarýn ýkýsýde negatýve ýse sayýlarýn carpýmýný yazdýrýn
		//sayýlarýn ýkýsýde darklý ýsarete sahýpse "farklý ýsaretlerde sayýlarla ýslem yapamazsýn" yazdrýýn
		//sayýlardan sýfýra esýt olan varsa "sýfýr carpmaya gore yutan elemandýr" yazdýrýn
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki sayý giriniz");

		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		if (num1==0 || num2==0) {
			System.out.println("Sifir carpmaya gore yutan elemandýr.");
		}
		
		else 
		if (num1>0 && num2>0) {
			System.out.println("sayilarin toplami :" +(num1+num2));
		}
		else 
		if (num1<0 && num1<0) {
			System.out.println("sayilarin carpimi :"+num1*num2);
		}else {
			
		}
		scan.close();
	}
	

}
