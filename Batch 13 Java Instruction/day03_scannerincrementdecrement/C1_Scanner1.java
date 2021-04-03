package day03_scannerincrementdecrement;

import java.util.Scanner;

public class C1_Scanner1 {
  public static void main(String[] args) {
	//kullanýcýdan ýsým ve soyýsmýný ýsteyelim
	  
	  //Scanner : kullanýcýdan bilgi almak için kullanýyoruz
	  //3 adýmda kullanýcýdan bilgi alma iþlemini tamamlýyoruz
	  //1. adýmda scanner objesý olusturuyoruz
	  //Scanner'ýn calýsmasý ýcýn Java.util(utilities)kutuphanesýnden ilgili
	  //kýsmý classýmýza import etmeliyiz
	 
	   Scanner scan=new Scanner(System.in);
	   
	   //kullanýcýya ne ýstedýgýnýzý belýrten býr mesaj yazmalýyýz
	   
	 // NOTE : asagýdaki kodu kolay yazmak ýcýn syso ctrl+space yaparak cekebýlýrýz
	   System.out.println("lütfen sadece isminiz giriniz");
	   
	   //3.adim bir variable olusturup kullanýcýnýn gýrýdýgý degeri atayacagýz 
	   
	   String name=scan.nextLine();
	   
	   System.out.println("lütfen sadece soyisminizi giriniz");
	   
	   String surname=scan.nextLine();
	   
	  // 	   String name=scan.next();   Line silip sadece next yazarsak kullanýcý 
	   //sadece býr kelýme yazar.
	   
	   //eðer yazdýrýcagýmýz yazý sabýt býr yazý ýse " " arasýnda yazýdýrýyoruz 
	   //eger býr valýable ye atanmýs degerý yazdýrmak ýstersek " " olmadan 
	   // sadece varýable ýsmýný yazýyoruz.

	   System.out.println("Ismýnýz : " + name);
	   System.out.println("Soyisminniz :"+ surname);
       System.out.println("kursumuza kaydýnýz tammamlanmýstýr,teþekkür ederiz");
       
       //bu yaptýgýmýz dosyayý kapatmak'týr
       scan.close();
       
       //f,n,sh
	   
	   
	  
	  
}
}

