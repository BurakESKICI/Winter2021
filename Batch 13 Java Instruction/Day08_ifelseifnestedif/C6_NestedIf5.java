package Day08_ifelseifnestedif;

import java.util.Scanner;

public class C6_NestedIf5 {

	public static void main(String[] args) {
		/*Soru 12) Kullanýcýdan 4 basamakli bir sayi girmesini isteyin.
		 *  Girdiði sayi 5’e bölünüyorsa  son rakamýný kontrol edin. 
		 *  Son rakamý 0 ise ekrana “5’e bölünen çift sayý”  yazdýrýn.
		 *   Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn.
		 *    Girdiði password  5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.
		 */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen 4 basamaklý sayÝ giriniz");
		
		int sayi=scan.nextInt();
		
		if ((sayi%5==0)&&(sayi%10==0)) {
			System.out.println("5'e bolunen cift sayi");
				}
		else if ((sayi%5==0) && (sayi%2!=0  )) {
			  System.out.println("5'e bolunen tek sayi");
		} else {
             System.out.println("Tekrar deneyin");
		}{

		}
		scan.close();
	}

}
