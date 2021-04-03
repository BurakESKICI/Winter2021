package day09_terneryoperator;

import java.util.Scanner;

public class C4_Ternery4 {

	public static void main(String[] args) {
		// Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin

    
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		
		int sayi1=scan.nextInt();
		
		System.out.println(sayi1%2==0 ? "çift sayi" : "tek sayi");
		
		//girilen sayinin mutlak degerini yazdiriniz
		//5 ->5  -12 ->12 /girilen sayi x olsun .x pozitifse |x|=x negatifse |x|=-x )
		
		System.out.println(sayi1>0 ? sayi1 : -sayi1);
		
		
		
		

scan.close();

	}

}
