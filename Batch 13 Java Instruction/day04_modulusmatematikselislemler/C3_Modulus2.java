package day04_modulusmatematikselislemler;

import java.util.Scanner;


public class C3_Modulus2 {

	public static void main(String[] args) {
	
		
		//kullanýcýdan 4 basamaklý býr sayý alalým ve sayýnýn basamaklarýný
		//ters sýrada yazdýralým.
		
		//bir sayýnýn basamaklarýný elde etmek ýcýn 2 ýslemý tekrar tekrar yaparýz.
		//1. iþlem en sondaki basamagý elde etmek 
		//2. iþlem en sondaki basamagý yok etmek 
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Basamaklarýný bulmak için 4 basamaklý bir sayý giriniz");
		
		int sayi=scan.nextInt();  //bu satirdan itibaren elimizde 4 basamaklý bir sayi var
		
		//4 basamagý elde etmek ýcýn yuakrýda yazdýgýmýz iþlemi 3 kere yapýyoruz
		//1. tekrar
		 
		int birlerbas= sayi %10;
		sayi /=10;//bunu yazarak kurtulmus olduk
				
				//bu satýrdan ýtýbaren sayýmýz artýk 3 basamaga dustu birler basamagýný almýs olduk
		//2. tekrar ile 10 lar basamagýný bulucaz 
		
				
		int onlarbas= sayi %10;//10lar basamagýný aldýk
		sayi /=10;//bunu yazarak 10 lar basamagýndan kurtulmus olduk
				
		//3.tekrar ve yuzler basamagý alýnýcak sýmdýde
		
	    int yuzlerbas=sayi % 10;//yüzleri aldýk
	    sayi /= 10 ; //yüzler basamagýndan kurtulduk 
	    
	    //artýk bu satýrdan ýtýbaren 1 tane sayý kaldý :) yaný artýk ýslem yapmamýza 
	    //gerek kalmadý sonuca gecelým
	    
	    int binlerBas= sayi % 10;// bunu yazmasakta olurdu son basamak oldugu ýcýn
	    
	    //tum basamaklarý yazdýrabýlýrýz artýk 
	    
	    System.out.println("biler basamaðý : " +birlerbas);
	    System.out.println("onlar basamaðý : "+ onlarbas);
	    System.out.println("yüzler basamaðý : "+ yuzlerbas);
	    System.out.println("binler basamaðý : "+ binlerBas);
	    
	    //finish
	    
	    //þimdi sayýyý tersten yazdýralým
	    System.out.println("yazdýgýnýz sayý :");
	    
	    System.out.print(binlerBas);
	    System.out.print( yuzlerbas);
	    System.out.print(onlarbas);
	    System.out.print( birlerbas);
	    
	    System.out.println();// bunu sýrf satýr kaysýn dýye yaptým :)
	    
	    System.out.println("yazdýgýnýz sayýnýn tersi :");
	    
	    System.out.print(birlerbas);
	    System.out.print( onlarbas);
	    System.out.print(yuzlerbas);
	    System.out.print( binlerBas);
	    
	  //finish
	    
	    scan.close();
	    
	    
	    
	    
	   
	    
	   
	    
	    
	    
		
		
		
		

	}

}
