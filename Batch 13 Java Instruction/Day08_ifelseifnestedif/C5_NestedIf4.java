package Day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf4 {

	public static void main(String[] args) {
		
		/*
		 * Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
           Kullanicidan bir sifre girmesini isteyin
         *Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise 
          “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
         *Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise 
          “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		 */
		
		//1-) kullanýcýdan þifreyi alip ilk harfine bak
		//buyuk harfmi yoksa kucuk harfmi ?

	    Scanner scan=new Scanner(System.in);
		
			System.out.println("Lutfen sifrenizi giriniz");
			
			char sifre=scan.nextLine().charAt(0); //girilen sifrenin ilk karakterni alýr
			
			if (sifre>='A' && sifre<='Z') {
				
				if (sifre=='A') {
					System.out.println("Sifre gecerli");
				} else {
					System.out.println("Sifre gecersiz");

				}
				
			} else if (sifre>='a' && sifre<='z') {
				
				if (sifre=='z') {
					System.out.println("Sifre gecerli"); 
					
				} else {
					System.out.println("Sifre gecersiz");

				}
				
				
			} else { //ilk harf buyuk harfveya kucuk harf degilse

				System.out.println("Sifre gecersiz");
			}
		
		scan.close();
	}

}
