package day04_modulusmatematikselislemler;

import java.util.Scanner;


public class C3_Modulus2 {

	public static void main(String[] args) {
	
		
		//kullan�c�dan 4 basamakl� b�r say� alal�m ve say�n�n basamaklar�n�
		//ters s�rada yazd�ral�m.
		
		//bir say�n�n basamaklar�n� elde etmek �c�n 2 �slem� tekrar tekrar yapar�z.
		//1. i�lem en sondaki basamag� elde etmek 
		//2. i�lem en sondaki basamag� yok etmek 
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Basamaklar�n� bulmak i�in 4 basamakl� bir say� giriniz");
		
		int sayi=scan.nextInt();  //bu satirdan itibaren elimizde 4 basamakl� bir sayi var
		
		//4 basamag� elde etmek �c�n yuakr�da yazd�g�m�z i�lemi 3 kere yap�yoruz
		//1. tekrar
		 
		int birlerbas= sayi %10;
		sayi /=10;//bunu yazarak kurtulmus olduk
				
				//bu sat�rdan �t�baren say�m�z art�k 3 basamaga dustu birler basamag�n� alm�s olduk
		//2. tekrar ile 10 lar basamag�n� bulucaz 
		
				
		int onlarbas= sayi %10;//10lar basamag�n� ald�k
		sayi /=10;//bunu yazarak 10 lar basamag�ndan kurtulmus olduk
				
		//3.tekrar ve yuzler basamag� al�n�cak s�md�de
		
	    int yuzlerbas=sayi % 10;//y�zleri ald�k
	    sayi /= 10 ; //y�zler basamag�ndan kurtulduk 
	    
	    //art�k bu sat�rdan �t�baren 1 tane say� kald� :) yan� art�k �slem yapmam�za 
	    //gerek kalmad� sonuca gecel�m
	    
	    int binlerBas= sayi % 10;// bunu yazmasakta olurdu son basamak oldugu �c�n
	    
	    //tum basamaklar� yazd�rab�l�r�z art�k 
	    
	    System.out.println("biler basama�� : " +birlerbas);
	    System.out.println("onlar basama�� : "+ onlarbas);
	    System.out.println("y�zler basama�� : "+ yuzlerbas);
	    System.out.println("binler basama�� : "+ binlerBas);
	    
	    //finish
	    
	    //�imdi say�y� tersten yazd�ral�m
	    System.out.println("yazd�g�n�z say� :");
	    
	    System.out.print(binlerBas);
	    System.out.print( yuzlerbas);
	    System.out.print(onlarbas);
	    System.out.print( birlerbas);
	    
	    System.out.println();// bunu s�rf sat�r kays�n d�ye yapt�m :)
	    
	    System.out.println("yazd�g�n�z say�n�n tersi :");
	    
	    System.out.print(birlerbas);
	    System.out.print( onlarbas);
	    System.out.print(yuzlerbas);
	    System.out.print( binlerBas);
	    
	  //finish
	    
	    scan.close();
	    
	    
	    
	    
	   
	    
	   
	    
	    
	    
		
		
		
		

	}

}
