package day12_stringmanupalation;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		
		// kullanýcýdan bir cumle alýn
		//ve asagýdaký uc durumdan uygun olaný yazdýrýn
		//1-cunmle java ýcermýyor
		//2- cumle 1 ajava ýcerýyor
		//3- cumlede býrden fazla java var 
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bý cumle gýrýnýz");
		
		String str = scan.nextLine().toLowerCase();
		
		int ÝlkJava=str.indexOf("java"); // -1 yada ilk javanýn indexini vericek
		int SonJava=str.lastIndexOf("java"); // -1 yada son javanýn index'ini vericek
		
		
		if (ÝlkJava==-1) {
			System.out.println("java cumle icermiyor");
		} else if (ÝlkJava==SonJava) {
			System.out.println("1 tane java iceriyor");
		} else {
            System.out.println("cumle 1'den fazla java iceriyor");
		}

		scan.close();
	}

}
