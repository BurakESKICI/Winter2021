package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C3_ArrayList03 {

	public static void main(String[] args) {
		// kullanýcýdan pozitif bir tam sayý alýn, aldýgýnýz sayýdan kucuk olan
		// fibonacci dizisi elemanlarýný yazdýrýn
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen pozitif bir tam sayý yazýnýz");
		int sayi=scan.nextInt();
		
		List<Integer> fibo = new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
	
		
		System.out.println(fibo); // [1,1]
		
		// aþaðýdaki for ile yapýlmý hali ;
		
		for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < sayi; i++) {
			
			fibo.add(fibo.get(i-2)+fibo.get(i-1));
		}
		
		System.out.println(fibo);
		
		
		// aþaðýdaki de while ile yapýlmý hali 
	/*	
		int i=2;
		int yeniSayi=0;
		
		
		while (yeniSayi<sayi) {
			yeniSayi=fibo.get(i-2)+fibo.get(i-1);
			fibo.add(yeniSayi);
			i++;
		}
		
		System.out.println(fibo);
*/
	}

}
