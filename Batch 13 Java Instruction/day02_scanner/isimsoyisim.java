package day02_scanner;

import java.util.Scanner;

public class isimsoyisim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// kullan�c�dan �s�m ve soy �s�m al�p aralar�na b�r bosluk b�rakarak
		//isim ve soyisim yazdirin
		//BURAK, ESKICI = Burak ESKICI
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen isminizi giriniz");
		
		String name=scan.nextLine();  //sadece next() se�ilirse kullan�c� birden fazla kelime 
				//girsebileilk kelimeal�n�r
				//e�er kullan�c� g�rd�g� tum yaz�y� almak �stersek nextLine() sec�lmel�d�r.
		System.out.println("L�tfen soyisminizi giriniz");
		String surname= scan.nextLine();
		
		System.out.println(name + " " + surname );
		
		scan.close();
	}

}
