package day13_stringmanipulation;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		
		// kullanýcýdan bir cumle ve aramak istedigi bir String isteyin
		//cumle String'i iceriyorsa "basarýlý" , degilse "basarisiz"yazdirin
		
		Scanner scan=new Scanner(System.in);

		System.out.println("lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("lutfen aramami istediginiz String'i giriniz");
		String aranan=scan.nextLine().toLowerCase(); 
		//java bu islemin sonucunu boolean, benim bunu yaziya cevirmem lazim
		
		System.out.println(cumle.contains(aranan) ? "Basarili" : "basarisiz");
		
		//kullanicidan mail adresini isteyin.Mail adresi @gmail.com iceriyorsa
		//"mailiniz kaydedildi", "lutfen gmail adresinizi giriniz" yazdirin
		
		System.out.println("lutfen mail adresinizi giriniz");
		
		String mail=scan.next();
		
		
		System.out.println(mail.contains("gmail.com") ? "mailiniz kaydedildi" : "lutfen gmail adresinizi giriniz");
		
		// eger @gmail.com 'un sonda oldugunu kontrol etmek istersek
		
		int sondami =mail.indexOf("@gmail.com", mail.length()-10); //index olarak length()-10 yaza
		//eger gmail gmail.com ile bitiyorsa bu iþlemin sonucu bir index olur ( int )
		//eger gmail gmail.com ile bitmiyorsa -1
		
	    if (mail.contains("@gmail.com") && sondami !=-1) {
			System.out.println("mailiniz kaydedildi");
		} else {
            System.out.println("lutfen gecerli bir gmail giriniz");
		}
		
		
		
		
		
		scan.close();
	}

}
