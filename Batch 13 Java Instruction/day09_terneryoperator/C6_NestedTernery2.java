package day09_terneryoperator;

import java.util.Scanner;

public class C6_NestedTernery2 {

	public static void main(String[] args) {
		
		/*
		 * Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , 
		 * buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bir harf giriniz");
		
		char str=scan.next().charAt(0);
		
		if (Character.isUpperCase(str)) {
			System.out.println("buyuk harf");
		} else if (Character.isLowerCase(str)) {
			System.out.println("kucuk harf");
		} else {
            System.out.println("girdiginiz karakter harf degil");
		}{

		}
		
		

		scan.close();
	}

}
