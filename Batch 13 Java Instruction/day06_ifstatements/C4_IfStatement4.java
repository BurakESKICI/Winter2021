package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		
		//kullan�c�dan g�n ismini isteyin girilen g�n hafta i�i veya hafta sonu
		//oldugunu yazd�r�n 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun adini giriniz");
		 
		String gun=scan.next().toLowerCase();
		
		
		//e�er stringlerde es�tl�k sorguluyorsak == kullanmamal�y�z
		//string degerde es�t olma durumunu sorgulama �c�n  equal(
		
		if (gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("HaftaSonu");
		}
		
		if (gun.equals("pazartesi") ||gun.equals("sal�") || gun.equals("carsamba")
				|| gun.equals("per�embe") || gun.equals("cuma")) {
			System.out.println("Haftaici");
		}
		
        //bu kodda gun �sm� yanl�s yaz�lm�ssa olusucak durum yok 
		
		
		
		
		
		scan.close();
	}

}
