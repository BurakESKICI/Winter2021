package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		
		//kullan�c�dan bir dikd�rtgen�n �k� kenar uzunlugunu al�n  
		//kenar uzunluklar� es�tse kare deg�lse d�kdortgen yazd�r�n
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen 2 kenar uzunlugunu giriniz");
		
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
      
		if (kenar1 == kenar2) {
			System.out.println("bu bir karedir");
		}
		
		if (kenar1!= kenar2) {
			System.out.println("bu bir dikd�rtgendir");
		}
		
		
		//buras�da tamamd�r.
		
		
    scan.close();
	}

}
