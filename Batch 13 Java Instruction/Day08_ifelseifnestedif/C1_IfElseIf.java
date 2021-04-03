package Day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		
		
		/*
		 * kullan�c�dan g�n ismini yazmas�n� isteyin 
		 * girilen isim ge�erli bir g�n ise g�n ismini
		 * 1.,2.ve 3. harflerini ilk harf b�y�k di�er ikisi k���k olarak yazd�r�n
		 * g�n ismi ge�erli de�ilse" ge�erli g�n ismini giriniz" yazd�r�n
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen g�n ismini giriniz");

		String gunIsm� = scan.nextLine().toLowerCase(); // girilen t�m yaz�y� kucuk harfe cev�rd�k
		
		// next() : sadece ilk kelimeyi alur spaceye kadar olan ilk kelimeyi
		//nextLine () : bu kod ise birden �ok kelimeyi almaya yarar
		
		
		if (gunIsm�.equalsIgnoreCase("pazar") || gunIsm�.equalsIgnoreCase("pazartesi")) {
			
			System.out.println("Paz");
		}
		else if (gunIsm�.equalsIgnoreCase("cuma") || gunIsm�.equalsIgnoreCase("cumartesi") ) {
			System.out.println("Cum");
		}
		else if (gunIsm�.equalsIgnoreCase("Sali")) {
			System.out.println("Sal");
		}
		else if (gunIsm�.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");
		}
		else if (gunIsm�.contentEquals("persembe")) {
			System.out.println("Per");
		}
		else  System.out.println("Lutfen gecerli gun ismi giriniz");
		
		//equalsIgnoreCase() : methofu iki string'in buyuk,kucuk hark hassasiyeti olmadan 
		//e�it olup olmad�g�n� kontrol eder.
		
		
		scan.close();
	}

}
