package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullan�c�dan 35'dan kucuk pozitif bir  sayi alin girilen asyinin
		//fakt�riyelini hesaplayan bir method olu�turun
		//6! = 1x2x3x4x5x6=720
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 35'dan kucuk bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi<0 || sayi>=35) {// bunlar i�imize gelmeyen durumlar
			
			System.out.println("lutfen gecerli bir sayi giriniz");
			
		} else {
			faktoriyelBul(sayi);// parantez ac�p kapat�p method olmas�n� sagl�yoruz
			//if else icine koyduk cunku �slem yapmas�n� �sted�g�m�z araya cektik
		}
		
		
		scan.close();
	}

	public static void faktoriyelBul(int sayi) {
		// void kald� cunku yen�den donmem�z gerekm�yor gerekseydi herhangi bir data type'a at�ycakt�k
		long faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
		}
		System.out.println(faktoriyel);
		
		
		
	}

}
