package day10_switchcase;

import java.util.Scanner;

public class C2_TerneryOperator {

	public static void main(String[] args) {
		//kullanýcýdan bir sayi alýn sayi cift ise 
		//cift yazdirin
		//degilse sayinin karesini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bir sayi yaziniz");

		int sayi=scan.nextInt();
		
		System.out.println(sayi%2==0 ? "cift" : sayi*sayi);
		
		scan.close();
	}

}
