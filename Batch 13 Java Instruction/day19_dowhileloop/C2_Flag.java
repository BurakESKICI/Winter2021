package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// kullan�c�dan b�r cumle al�n cumlede buyuk harf var m� yok mu yazd�r�n
		//while loop kullanarak!

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen b�r cumle g�r�n�z");
		String cumle=scan.nextLine();  //Ali okula gel
		
		String flag="yok";
		
		
		int index =0;
		while (index <cumle.length()) {
			
			
			if (cumle.charAt(index)>'A' && cumle.charAt(index)<'Z') {
				flag="var";
			}
			index++;
		}
		
		System.out.println("verdiginiz cumlede buyuk harf "+ flag);
		
		
		
		
		scan.close();
	}

}
