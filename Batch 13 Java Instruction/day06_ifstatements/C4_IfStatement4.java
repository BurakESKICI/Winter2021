package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		
		//kullanýcýdan gün ismini isteyin girilen gün hafta içi veya hafta sonu
		//oldugunu yazdýrýn 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun adini giriniz");
		 
		String gun=scan.next().toLowerCase();
		
		
		//eðer stringlerde esýtlýk sorguluyorsak == kullanmamalýyýz
		//string degerde esýt olma durumunu sorgulama ýcýn  equal(
		
		if (gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("HaftaSonu");
		}
		
		if (gun.equals("pazartesi") ||gun.equals("salý") || gun.equals("carsamba")
				|| gun.equals("perþembe") || gun.equals("cuma")) {
			System.out.println("Haftaici");
		}
		
        //bu kodda gun ýsmý yanlýs yazýlmýssa olusucak durum yok 
		
		
		
		
		
		scan.close();
	}

}
