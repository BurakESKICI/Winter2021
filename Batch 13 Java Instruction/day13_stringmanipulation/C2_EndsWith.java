package day13_stringmanipulation;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
		
		// 
		
		String str="Java ile hayat ne guzel";
		
		System.out.println(str.endsWith("zel")); //true
		
		System.out.println(str.endsWith("ne guzel"));// true
		
		System.out.println(str.endsWith("zel ")); // False
		
		//Kullanicidan bir email isteyin
		//eger @ isareti icermiyorsa "girdiginiz bilgiemail degil"
		//eger @ isareti iceriyor ama @gmail.com icermiyorsa "lutfen gmail adresi yazýn"
		//eger ilk iki sarti saglýyor ama @gmail.com ile bitmiyor ise "gecersiz gmail adresi"
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bir email giriniz");
		
		String mail=scan.nextLine();
		
		if (!mail.contains("@")) { //basinda ! olunca -> enail @ icermiyorsa  
			System.out.println("girdiginiz bilgi gmail degil");
		} else if (!mail.contains("@gmail.com")) { // basýna unlem yazýnca ýcermýyorsa ya donusuyor kod 
			System.out.println("lutfen gmail adresi yazýn");
		} else if (mail.endsWith("@gmail.com")) {
			System.out.println("emailiniz basariyla kaydedildi");
		} else {
           System.out.println("gecersiz gmail adresi");
		}

		scan.close();
	}

}
