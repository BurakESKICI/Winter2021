package day18_Whileloop;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		
		/*Soru 4) Kullanicidan baslangic ve bitis haflerini alin 
		 * ve baslangic harfinden baslayip bitis harfinde biten tum harfleri 
		 * buyuk harf olarak ekrana yazdirin. Kullanicinin hata yapmadigini farz edin.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen baslangýc harfini giriniz");
		char basHarf= scan.next().toUpperCase().charAt(0);
		
		
	    System.out.println("lutfen bitis harfini giriniz");
	    char bitHarf = scan.next().toUpperCase().charAt(0);
	    
	    for (char i = basHarf; i <= bitHarf; i++) {
			System.out.println(i +",");
		}
	    System.out.println("");
	    //while loop ile yapalým
	    //baslangýc degeri var basHarfü
	    
	    while (basHarf<=bitHarf) {
			
	    	System.out.println(basHarf +",");
	    	
	    	basHarf++;
	    	
		}
	    
		scan.close();
	}

}
