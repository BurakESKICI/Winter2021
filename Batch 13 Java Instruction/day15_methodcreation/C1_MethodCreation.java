package day15_methodcreation;

import java.util.Scanner;

public class C1_MethodCreation {

	public static void main(String[] args) {

		/*
		 * Soru 1 ) Kullanicidan bir tam sayi alin. bu sayinin negatif veya pozitif
		 * oldugunu sayinin basamak sayisini, tek mi cift mi oldugunu ve 100’den buyukse
		 * birler,onlar ve yuzler basamagindaki rakamlarin toplamini, 100’den kucukse
		 * sadece 1’ler basamagini yazdirin.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen bir tam sayi giriniz");
		int sayi = scan.nextInt();

		pozitifNegatif(sayi); // girilen sayi argümentinin pozitif yada negatif oldugunu yazdirsin	
		tekMiCiftMi(sayi);
		
		if (sayi>=100) {
		
			yuzdenBuyuk(sayi);
			
		} else {

			yuzdenKucuk(sayi);
		}
		
          
		scan.close();
	}// buradan sonrasý main'nin dýþýdýr
	
	public static void yuzdenKucuk(int sayi) {
		
		System.out.println(sayi%10);
		
	}

	public static void yuzdenBuyuk(int sayi) {
		
		int rakamlarToplami;
		rakamlarToplami = sayi%10; // birler basamgý // 9
		sayi /= 10;
		rakamlarToplami += sayi%10;
		sayi/=10;
		rakamlarToplami += sayi%10;
		System.out.println(rakamlarToplami);
		
		
		
	}

	public static void tekMiCiftMi(int sayi) {
		
		System.out.println(sayi%2==0 ? "cift" : "tek");
		
	}

	public static void pozitifNegatif(int sayi ) { //parametre yazarken data tipini'de yazmaliyiz
		
		
		System.out.println(sayi>0 ? "pozitif" : (sayi<0 ? "negatif" : "nötr"));
		
		
	}
	
	

}
