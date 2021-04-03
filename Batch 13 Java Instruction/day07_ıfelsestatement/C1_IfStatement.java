package day07_ýfelsestatement;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		
		//kullanýcýdan bir tamsayý isteyin
		//sayý pozitif ise "sayý pozitif"yazdýrýn
		//sayi 100'den kucukse "kucuk sayý yazdýrýn
		//sayi 100'den buyukse buyuk sayý yazdýrýn
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Lutfen bir tam sayhý yazýnýz");
		 
		 double num=scan.nextDouble();
		 
		 
		 if (num>0) {
			System.out.println("pozitif bir sayidir");
		}
		 if (num<0) {
			System.out.println("negatif sayý");
		}
		 if (num>100) {
			System.out.println("buyuk sayý");
		}
		if (num<100) {
			System.out.println("kücük sayý");
		}
		
		//tamamýyla kendim yazdým 
		
		scan.close();

	}

}
