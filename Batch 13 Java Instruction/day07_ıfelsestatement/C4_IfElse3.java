package day07_ýfelsestatement;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		
		//kullanýcýdan yasýný sorun 
		//65 den buyukse emekli olabýlýrsýn
		//yoksa emeklý olamazsýn yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yaþýnýz");
		
		double num1=scan.nextDouble();
		
		if (num1>=65) {
			System.out.println("emekli olabilirsiniz");
		}
		if (num1<65) {
			System.out.println("emekli olamazsýnýz");
		}
		
scan.close();
	}

}
