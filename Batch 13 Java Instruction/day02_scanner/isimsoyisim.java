package day02_scanner;

import java.util.Scanner;

public class isimsoyisim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// kullanýcýdan ýsým ve soy ýsým alýp aralarýna býr bosluk býrakarak
		//isim ve soyisim yazdirin
		//BURAK, ESKICI = Burak ESKICI
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen isminizi giriniz");
		
		String name=scan.nextLine();  //sadece next() seçilirse kullanýcý birden fazla kelime 
				//girsebileilk kelimealýnýr
				//eðer kullanýcý gýrdýgý tum yazýyý almak ýstersek nextLine() secýlmelýdýr.
		System.out.println("Lütfen soyisminizi giriniz");
		String surname= scan.nextLine();
		
		System.out.println(name + " " + surname );
		
		scan.close();
	}

}
