package day07_�felsestatement;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		
		// kullan�c�dan b�r karakter g�rmes�n� �stetey�n
		//harf olup olmad�g�n� yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz");
		
		char Harf=scan.next().charAt(0);

		//bunu ezberle
		//A�AGIDA A VE Z ARASINI GIRMIS OLDUK bunu unutma charda �k� karakter aras� harfler g�r�lebilir
		
		if (Harf>='a' && Harf<='z' || Harf >='A' && Harf<='Z') {
			System.out.println("girdigini karakter Harf");
		} else {
            System.out.println("girdiginiz karakter Harf degil");
		}
		
		
		
		
		scan.close();
	}

}
