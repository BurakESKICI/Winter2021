package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullanýcýdan hangi günde oldugummuzu isteyin yazýyla
		//hafta ici mi dewðilmi onu yazdir
		
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen hangi günde oldugumuzu yazýyla giriniz");
		
		String gun=scan.next().toLowerCase(); //pAZaR --> pazar
		
		
		
		switch (gun) {
        case "pazartesi":
        case "sali":
        case "carsamba":          
        case "persembe":
        case "cuma":
            System.out.println("hafta ici");
            break;
        case "cumartesi":
        case "pazar":
            System.out.println("hafta sonu");
            break;
        default:
            System.out.println("Lütfen tekrar giriniz");
            break;
        
        }
		//biden fazla durum ayný sonucu paylasýyorsa breakleri atlayýp yukarýdaký gýbý 
		//yazabiliriz.bu durum iþimi zi kolaylaþtýrýr

		scan.close();
	}

}
