package day03_scannerincrementdecrement;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		//kullan�c�dan �sm�n� �stey�p �lk harf�n� buyuk olarak yazd�r�n
		//burak  ==>  basharf�n�z : M
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen isminizin ilk Harfini b�y�k olarak yaz�n�zz");
		
		char ilkharf=scan.next().toUpperCase().charAt(0);
		
		//string de harfler�n �ndexler� 0 dan baslar
		//biz ilk harf� almak �sted�g�m�z �c�n �ndex oalrak 0 g�rmel�y�z
		//toUpperCase b�y�k harfi almas� i�in koyduk ve charAt den �nce gelmes�n� sebeb� ise 
		//char data tipinin primitive olmas� ve primitive data tiplerinin method almamas�
		
		System.out.println("ba� harfiniz : " + ilkharf);
		
		scan.close();
		
	}
}
