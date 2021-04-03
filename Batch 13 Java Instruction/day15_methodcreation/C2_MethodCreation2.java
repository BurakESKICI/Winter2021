package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		/*Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
		 *  Kullanici 2,3 veya 4 degerini girerse,
		 *   kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin. 
		 *   Kullanici toplamak istedigi sayi adedini 4�den buyuk girerse �Cok sayi girdiniz, ben toplayamam� yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kac sayi toplamak istediginizi giriniz :");
		
		int adet=scan.nextInt();
		
		if (adet<2) {
			System.out.println("En az iki sayi girmelisiniz");
		} else if (adet==2) {
			
			
			ikiSayiTopla();
			
		}else if (adet==3) {
			
			ucSayiTopla();
			
		} else if (adet==4) {
			
			dortSay�Topla();
			
		}else if (adet>5) {
			System.out.println("Cok sayi girdiniz,ben toplayamam");
		} else {

			System.out.println("l�tfen tekrar deneyiniz");
		}{
			scan.close();
		}
		


	}

	public static void dortSay�Topla() {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Lutfen 4 sayi giriniz ");
	        double sayi1 = scan.nextDouble();
	        double sayi2 = scan.nextDouble();
	        double sayi3 = scan.nextDouble();
	        double sayi4 = scan.nextDouble();
	        System.out.println("Girilen sayilar toplami : " + (sayi1 + sayi2 + sayi3 + sayi4));
	        
	        scan.close();
	}

	public static void ucSayiTopla() {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Lutfen 3 sayi giriniz ");
	        double sayi1 = scan.nextDouble();
	        double sayi2 = scan.nextDouble();
	        double sayi3 = scan.nextDouble();
	        System.out.println("Girilen sayilar toplami : " + (sayi1 + sayi2 + sayi3 ));
	        
	        scan.close();
		
	}

	public static void ikiSayiTopla() {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Lutfen 2 sayi giriniz ");
	        double sayi1 = scan.nextDouble();
	        double sayi2 = scan.nextDouble();
	        
	        System.out.println("Girilen sayilar toplami : " + (sayi1 + sayi2 ));
	        
	        scan.close();
		
	}

}
