package day03_scannerincrementdecrement;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		//kullanýcýdan ýsmýný ýsteyýp ýlk harfýný buyuk olarak yazdýrýn
		//burak  ==>  basharfýnýz : M
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen isminizin ilk Harfini büyük olarak yazýnýzz");
		
		char ilkharf=scan.next().toUpperCase().charAt(0);
		
		//string de harflerýn ýndexlerý 0 dan baslar
		//biz ilk harfý almak ýstedýgýmýz ýcýn ýndex oalrak 0 gýrmelýyýz
		//toUpperCase büyük harfi almasý için koyduk ve charAt den önce gelmesýný sebebý ise 
		//char data tipinin primitive olmasý ve primitive data tiplerinin method almamasý
		
		System.out.println("baþ harfiniz : " + ilkharf);
		
		scan.close();
		
	}
}
