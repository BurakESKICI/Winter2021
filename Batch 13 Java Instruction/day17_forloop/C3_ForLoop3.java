package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullanýcýdan 35'dan kucuk pozitif bir  sayi alin girilen asyinin
		//faktöriyelini hesaplayan bir method oluþturun
		//6! = 1x2x3x4x5x6=720
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 35'dan kucuk bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi<0 || sayi>=35) {// bunlar iþimize gelmeyen durumlar
			
			System.out.println("lutfen gecerli bir sayi giriniz");
			
		} else {
			faktoriyelBul(sayi);// parantez acýp kapatýp method olmasýný saglýyoruz
			//if else icine koyduk cunku ýslem yapmasýný ýstedýgýmýz araya cektik
		}
		
		
		scan.close();
	}

	public static void faktoriyelBul(int sayi) {
		// void kaldý cunku yenýden donmemýz gerekmýyor gerekseydi herhangi bir data type'a atýycaktýk
		long faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
		}
		System.out.println(faktoriyel);
		
		
		
	}

}
