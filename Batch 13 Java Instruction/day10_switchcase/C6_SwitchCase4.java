package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullan�c�dan VIP (very important person )k�saltmas�nda hangi harfin anlam�n� istedigini soral�m 
		//girilen harfin ac�klamas�n� yazd�ral�m 
		// KOD 1 ;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen V.I.P.harfler�nden birini giriniz");
		
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
			System.out.println("lutfen VIP harfler�nden b�r�n� g�r�n�z");
			break;
		 }
		
		// burada ise kullan�c� birden fazla harf girerse �al�sm�ycakt�r :) 
		// KOD 2 ;
		System.out.println("lutfen harf g�r�n�z");

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
			System.out.println("lutfen VIP harfler�nden b�r�n� g�r�n�z");
			break;
		 }
		
		
		
		
		
scan.close();
	}

}
