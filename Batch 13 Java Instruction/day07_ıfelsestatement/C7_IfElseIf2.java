package day07_�felsestatement;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// kullan�c�dan iki sayi isteyin
		//say�lar�n �k�s� de poz�t�f �se say�lar�n toplam� yazd�r�n
	    //say�lar�n �k�s�de negat�ve �se say�lar�n carp�m�n� yazd�r�n
		//say�lar�n �k�s�de darkl� �sarete sah�pse "farkl� �saretlerde say�larla �slem yapamazs�n" yazdr��n
		//say�lardan s�f�ra es�t olan varsa "s�f�r carpmaya gore yutan elemand�r" yazd�r�n
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki say� giriniz");

		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		if (num1==0 || num2==0) {
			System.out.println("Sifir carpmaya gore yutan elemand�r.");
		}
		
		else 
		if (num1>0 && num2>0) {
			System.out.println("sayilarin toplami :" +(num1+num2));
		}
		else 
		if (num1<0 && num1<0) {
			System.out.println("sayilarin carpimi :"+num1*num2);
		}else {
			
		}
		scan.close();
	}
	

}
