package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C3_ArrayList03 {

	public static void main(String[] args) {
		// kullan�c�dan pozitif bir tam say� al�n, ald�g�n�z say�dan kucuk olan
		// fibonacci dizisi elemanlar�n� yazd�r�n
		
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen pozitif bir tam say� yaz�n�z");
		int sayi=scan.nextInt();
		
		List<Integer> fibo = new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
	
		
		System.out.println(fibo); // [1,1]
		
		// a�a��daki for ile yap�lm� hali ;
		
		for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < sayi; i++) {
			
			fibo.add(fibo.get(i-2)+fibo.get(i-1));
		}
		
		System.out.println(fibo);
		
		
		// a�a��daki de while ile yap�lm� hali 
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
