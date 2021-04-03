package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
//Scanner ile kullan�c�dan bilgi alabiliriz
		//3 adim ile scanner i�lemini ger�ekle�tiriyoruz
		
		//1.adim Scanner olu�turucagiz
		//asag�dak� kodu yazmadan olmaz bu sart 
		
		Scanner scan = new Scanner (System.in);
		
		//new : Java da ne zaman kelimesini g�rseniz yeni bir object olu�turuluyor demektir.
		//parantezin i�ine yaz�lan de�erlere parametre diyoruz ve Scanner i�in System.in yazmam�z gerekir
		//bir kod yazd�g�m�zda kodun alt�nda k�rm�z� c�zg� olusuyorsa veya sat�r numaras� olan k�s�mda
		// k�rm�z� carp� �saret� olusuyorsa b�r seyler yanl�s demektir
		//kod yazd�g�nda k�rm�z� yaz� c�k�yorsa alt�nda mouse u uzer�ne get�r�p duzelt�lmes� gereken yard�m� alab�l�rs�n
		//java.util javan�n bizim i�in haz�rlad�g� kutuphanedir ihtiyac�m�z oldugunda htiyac�m�z olan kodlar�
		//class a import etmemiz  yeterlidir
		// scan olusturdugumuz Scanner objes�ne verd�g�m�z b�r �s�md�r. farkl� �s�mler de vereb�l�r�z
		//ancak scan �sm� tum programc�lar taraf�ndan kullan�lan b�r �s�md�r
		// kodumuz anlas�lab�l�r ve rahat okunab�l�r olmas� �c�n scan �sm�n� kullanmam�z tavs�ye ed�l�r.
		//bir �eyi i�eri almak i�in "in" d��ar� almak i�in " out " yaz�yoruz
		
		
		//2.adim kullan�c�ya bir mesaj yaz�n 
		
		System.out.println("Karenin bir kenar�n�n uzunlu�unu giriniz");
		
		//3.adim kullan�c�n�n konsola girdigi degeri program�m�za alacag�z
		//kullan�c�dan bir kenar uzunlugu �sted�g�m �c�n kucuk buyuk veya v�rgullu b�r say� g�reb�l�r bu sebeple
		//bu method da Double kullanmak en mant�kl� secenek olucakt�r.
		//genelde kullan�c�n�n hang� say�y� sececeg�n� on goremed�g�m�zde double secer�z
		
	double kenar=scan.nextDouble();
	
	System.out.println(kenar*kenar);
	
	scan.close();
	
	
	}

}
