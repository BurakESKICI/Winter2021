package day18_Whileloop;

public class C2_WhileLoop {

	public static void main(String[] args) {
		
		// while : iken, oldugu s�rece anlam�na gelir
		// 10'dan 30'a kadar olan say�lardan 4 ile b�l�nebilenleri
		//aralar�nda bir bosluk olacak sek�lde yanyana yazdirin
		
		//�nce for loop ile yapalim
		
		
		for (int i = 10; i <=30; i++) {
			
			if (i%4==0) {
				System.out.print(i+" ");
			}
			
		}
	    System.out.println(" ");
		//ayn�s�n� while loop ile yapal�m
		
		int sayi=10; //1.sarti gerceklestirdim (Baslangic degeri)
	   while (sayi<=30) { // 2.sarti gerceklestirdim ( bitis kosulu )
		   if (sayi%4==0) {
			System.out.println(sayi +" ");
		}
		   
		   sayi++; // 3.sarti gerceklestirdim (degisim degeri)
		
	}

	}

}
