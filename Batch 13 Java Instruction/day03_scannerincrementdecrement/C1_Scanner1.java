package day03_scannerincrementdecrement;

import java.util.Scanner;

public class C1_Scanner1 {
  public static void main(String[] args) {
	//kullan�c�dan �s�m ve soy�sm�n� �steyelim
	  
	  //Scanner : kullan�c�dan bilgi almak i�in kullan�yoruz
	  //3 ad�mda kullan�c�dan bilgi alma i�lemini tamaml�yoruz
	  //1. ad�mda scanner objes� olusturuyoruz
	  //Scanner'�n cal�smas� �c�n Java.util(utilities)kutuphanes�nden ilgili
	  //k�sm� class�m�za import etmeliyiz
	 
	   Scanner scan=new Scanner(System.in);
	   
	   //kullan�c�ya ne �sted�g�n�z� bel�rten b�r mesaj yazmal�y�z
	   
	 // NOTE : asag�daki kodu kolay yazmak �c�n syso ctrl+space yaparak cekeb�l�r�z
	   System.out.println("l�tfen sadece isminiz giriniz");
	   
	   //3.adim bir variable olusturup kullan�c�n�n g�r�d�g� degeri atayacag�z 
	   
	   String name=scan.nextLine();
	   
	   System.out.println("l�tfen sadece soyisminizi giriniz");
	   
	   String surname=scan.nextLine();
	   
	  // 	   String name=scan.next();   Line silip sadece next yazarsak kullan�c� 
	   //sadece b�r kel�me yazar.
	   
	   //e�er yazd�r�cag�m�z yaz� sab�t b�r yaz� �se " " aras�nda yaz�d�r�yoruz 
	   //eger b�r val�able ye atanm�s deger� yazd�rmak �stersek " " olmadan 
	   // sadece var�able �sm�n� yaz�yoruz.

	   System.out.println("Ism�n�z : " + name);
	   System.out.println("Soyisminniz :"+ surname);
       System.out.println("kursumuza kayd�n�z tammamlanm�st�r,te�ekk�r ederiz");
       
       //bu yapt�g�m�z dosyay� kapatmak't�r
       scan.close();
       
       //f,n,sh
	   
	   
	  
	  
}
}

