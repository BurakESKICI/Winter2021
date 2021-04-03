package day15_methodcreation;

public class C3_MethodOverloading {

	public static void main(String[] args) {
		// Java'da ayni isimle birden fazla method olusturulursa buna overloading denir.
		//Overloading yapabilmek icin Method signature'larinin farkli olmasý gerekir.
		//Method Signature = isim + parametre data turu birbirini kapsayan data turleri oldugunda
		//Java en optimum cozumu uretir (tamamen uyan varsa o method'u calýstýrýr,eger yoksa en
		//yakýn method'u calýstýrýr)
		
		toplama(2.2, 5); //
		

	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("integer method sonucu :" + (sayi1 + sayi2));
	}

	public static void toplama(double sayi1, double sayi2) {
		System.out.println("double method sonucu :" + (sayi1 + sayi2));
	}

	public static void toplama(int sayi1, double sayi2) {
		System.out.println("integer/double method sonucu :" + (sayi1 + sayi2));
	}

	public static void toplama(char sayi1, char sayi2) {
		System.out.println("char method sonucu :" + (sayi1 + sayi2));
	}

	public static void toplama(String str1, String str2) {
		System.out.println("String method sonucu :" + (str1 + str2));
	}



	}


