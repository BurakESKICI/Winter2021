package day07_�felsestatement;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		
		//kullan�c�dan bir tamsay� isteyin
		//say� pozitif ise "say� pozitif"yazd�r�n
		//sayi 100'den kucukse "kucuk say� yazd�r�n
		//sayi 100'den buyukse buyuk say� yazd�r�n
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen bir tam sayh� yaz�n�z");
		 
		 double num=scan.nextDouble();
		 
		 
		 if (num>0) {
			System.out.println("pozitif bir sayidir");
		}
		 if (num<0) {
			System.out.println("negatif say�");
		}
		 if (num>100) {
			System.out.println("buyuk say�");
		}
		if (num<100) {
			System.out.println("k�c�k say�");
		}
		
		//tamam�yla kendim yazd�m 
		
		scan.close();

	}

}
