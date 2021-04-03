package day16_forloop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		
		// kullanicidan pozitif 2 tamsayi alin
        // aldigimiz degerlerden kucuk olandan baslayip, buyuk olana kadar 
        // tum sayilari yanyana (virgulle ayrilarak) yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 2 pozitif sayi giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int kucuksayi=0;
		int buyuksayi=0;
		
		
		if (sayi1<0 || sayi2<0) {
			System.out.println("lutfen pozitif tam sayi giriniz");
		} else if (sayi1>sayi2) {

			buyuksayi=sayi1;
			kucuksayi=sayi2;
		}else {
			buyuksayi=sayi2;
			kucuksayi=sayi1;
		}
		
		for (int i = kucuksayi; i <=buyuksayi; i++) {
			
			System.out.print(i + ",");
		}
		
		
		
		
		scan.close();
		
	}

}
