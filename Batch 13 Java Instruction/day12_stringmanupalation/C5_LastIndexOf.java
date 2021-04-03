package day12_stringmanupalation;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		
		// kullan�c�dan bir cumle al�n
		//ve asag�dak� uc durumdan uygun olan� yazd�r�n
		//1-cunmle java �cerm�yor
		//2- cumle 1 ajava �cer�yor
		//3- cumlede b�rden fazla java var 
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen b� cumle g�r�n�z");
		
		String str = scan.nextLine().toLowerCase();
		
		int �lkJava=str.indexOf("java"); // -1 yada ilk javan�n indexini vericek
		int SonJava=str.lastIndexOf("java"); // -1 yada son javan�n index'ini vericek
		
		
		if (�lkJava==-1) {
			System.out.println("java cumle icermiyor");
		} else if (�lkJava==SonJava) {
			System.out.println("1 tane java iceriyor");
		} else {
            System.out.println("cumle 1'den fazla java iceriyor");
		}

		scan.close();
	}

}
