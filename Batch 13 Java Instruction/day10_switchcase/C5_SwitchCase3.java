package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullan�c�dan hangi g�nde oldugummuzu isteyin yaz�yla
		//hafta ici mi dew�ilmi onu yazdir
		
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen hangi g�nde oldugumuzu yaz�yla giriniz");
		
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
            System.out.println("L�tfen tekrar giriniz");
            break;
        
        }
		//biden fazla durum ayn� sonucu paylas�yorsa breakleri atlay�p yukar�dak� g�b� 
		//yazabiliriz.bu durum i�imi zi kolayla�t�r�r

		scan.close();
	}

}
