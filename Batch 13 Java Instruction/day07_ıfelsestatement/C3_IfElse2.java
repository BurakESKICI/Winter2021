package day07_ýfelsestatement;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		
		// kullanýcýdan býr karakter gýrmesýný ýsteteyýn
		//harf olup olmadýgýný yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz");
		
		char Harf=scan.next().charAt(0);

		//bunu ezberle
		//AÞAGIDA A VE Z ARASINI GIRMIS OLDUK bunu unutma charda ýký karakter arasý harfler gýrýlebilir
		
		if (Harf>='a' && Harf<='z' || Harf >='A' && Harf<='Z') {
			System.out.println("girdigini karakter Harf");
		} else {
            System.out.println("girdiginiz karakter Harf degil");
		}
		
		
		
		
		scan.close();
	}

}
