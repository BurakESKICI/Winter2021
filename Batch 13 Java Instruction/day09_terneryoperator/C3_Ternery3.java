package day09_terneryoperator;

import java.util.Scanner;

public class C3_Ternery3 {

	public static void main(String[] args) {
		
		// kullanýcýdan iki sayi alin buyuk olani yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen ilk sayiyi giriniz");
		
		double sayi1=scan.nextDouble();
		
		System.out.println("lutfen ikinci sayiyi giriniz");
		
		double sayi2=scan.nextDouble();
		
		System.out.println(sayi1>sayi2 ? sayi1 : sayi2);
		
		
		scan.close();

	}

}
