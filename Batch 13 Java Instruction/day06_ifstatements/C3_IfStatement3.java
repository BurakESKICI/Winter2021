package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		
		//kullan�c�dan g�n isminin ilk harfini isteyin ve harfe uygun olan gun 
		//isimlerini yazd�r�n
		//kullan�c� c girerse cuma veya cumartes� g�b� 
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("G�n isminin ilk harfini giriniz");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		//bu satir itibariyle girilen String'in ilk karakterini alm�s oldum.
		
		//p , s , c 
		
		if (ilkHarf=='p' || ilkHarf=='P') {
			System.out.println("pazar,pazartesi,per�embe");
		}
		
		if (ilkHarf=='s' || ilkHarf=='S') {
			System.out.println("sal�");
		}
		
		if (ilkHarf=='c' || ilkHarf=='C') {
			System.out.println("carsamba,cumartesi,cuma");
		}
		
		
		if (ilkHarf!='c' && ilkHarf!='C' && ilkHarf!='p'  && ilkHarf!='P' && ilkHarf!='s' && ilkHarf!='S') {
			System.out.println("maalesef yazd�g�n�z harf ile ilgili g�n bulunamam�st�r!");
		}
		
		
		
     scan.close();
	}

}
