package day13_stringmanipulation;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle isteyin
				// cumledeki tum bosluklari silin ve
				// tum a'larin yerine e yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen b�r vumle g�r�n�z");

		String cumle=scan.nextLine().toLowerCase();
		System.out.println(cumle.replace(" ", ""));
		System.out.println(cumle.replace("a","e"));
		
		
		
		
		
		System.out.println("lutfen bir cumle daha giriniz");
		String str2=scan.nextLine();
		
		System.out.println(str2.replace(" ", "").replace("a", "e"));
		
		//hem a hemde e nin yerine i yazal�m 
		System.out.println(str2.replace("a","i").replace('e', 'i'));
		
		//buyuk kucuk harf gozetmeks�z�n nas�l replace yapab�l�r�z
		
		System.out.println(str2.toLowerCase().replace("a","i").replace("e", "i"));
		
		scan.close();
	}

}
