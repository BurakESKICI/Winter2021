package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		// kullan�c�dan bir say� isteyin ve say�n�n tek veya �ift say� oldugunu yazd�r�n.
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("l�tfen bir tam say� giriniz");
        
		
		int num=scan.nextInt();
		
		
		if (num%2==0) {
			System.out.println("girdi�iniz say� �ift say�d�r.");
		}
		
		if (num%2!=0) {
			System.out.println("girdi�iniz say� tek say�d�r.");
		}
		
		System.out.println("kat�ld���n�z i�in te�ekk�rler.");
		
		
	
		scan.close();
	}

}
