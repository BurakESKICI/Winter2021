package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// kullanýcýdan býr cumle alýn cumlede buyuk harf var mý yok mu yazdýrýn
		//while loop kullanarak!

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen býr cumle gýrýnýz");
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
