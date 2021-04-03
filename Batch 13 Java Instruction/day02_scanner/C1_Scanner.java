package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
//Scanner ile kullanýcýdan bilgi alabiliriz
		//3 adim ile scanner iþlemini gerçekleþtiriyoruz
		
		//1.adim Scanner oluþturucagiz
		//asagýdaký kodu yazmadan olmaz bu sart 
		
		Scanner scan = new Scanner (System.in);
		
		//new : Java da ne zaman kelimesini görseniz yeni bir object oluþturuluyor demektir.
		//parantezin içine yazýlan deðerlere parametre diyoruz ve Scanner için System.in yazmamýz gerekir
		//bir kod yazdýgýmýzda kodun altýnda kýrmýzý cýzgý olusuyorsa veya satýr numarasý olan kýsýmda
		// kýrmýzý carpý ýsaretý olusuyorsa býr seyler yanlýs demektir
		//kod yazdýgýnda kýrmýzý yazý cýkýyorsa altýnda mouse u uzerýne getýrýp duzeltýlmesý gereken yardýmý alabýlýrsýn
		//java.util javanýn bizim için hazýrladýgý kutuphanedir ihtiyacýmýz oldugunda htiyacýmýz olan kodlarý
		//class a import etmemiz  yeterlidir
		// scan olusturdugumuz Scanner objesýne verdýgýmýz býr ýsýmdýr. farklý ýsýmler de verebýlýrýz
		//ancak scan ýsmý tum programcýlar tarafýndan kullanýlan býr ýsýmdýr
		// kodumuz anlasýlabýlýr ve rahat okunabýlýr olmasý ýcýn scan ýsmýný kullanmamýz tavsýye edýlýr.
		//bir þeyi içeri almak için "in" dýþarý almak için " out " yazýyoruz
		
		
		//2.adim kullanýcýya bir mesaj yazýn 
		
		System.out.println("Karenin bir kenarýnýn uzunluðunu giriniz");
		
		//3.adim kullanýcýnýn konsola girdigi degeri programýmýza alacagýz
		//kullanýcýdan bir kenar uzunlugu ýstedýgým ýcýn kucuk buyuk veya výrgullu býr sayý gýrebýlýr bu sebeple
		//bu method da Double kullanmak en mantýklý secenek olucaktýr.
		//genelde kullanýcýnýn hangý sayýyý sececegýný on goremedýgýmýzde double secerýz
		
	double kenar=scan.nextDouble();
	
	System.out.println(kenar*kenar);
	
	scan.close();
	
	
	}

}
