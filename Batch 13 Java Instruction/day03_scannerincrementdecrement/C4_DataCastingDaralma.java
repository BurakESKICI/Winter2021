package day03_scannerincrementdecrement;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double bir degisken olustural�m ve bunu �nteger ve byte cev�rel�m

		double numDouble = 50;
		
		int numInt =(int) numDouble;
		
		System.out.println("integer deg�sken deger� :" + numInt);
		
		byte numByte = (byte)numDouble;
		//daha dar (narrow) bir data tipine cevv�r�rken eger datatipinin sinirindan 
		//b�y�kse saymaya negat�f en kucuk say�dan devam eder ,istnen say�ya gel�nceye
		//kadar tekrar tekrar en kucuk negat�f say�ya g�der.
		
		System.out.println("byte deg�sken deger� : " +numByte );
		
		// e�er double bir say�da virgull� olup da cev�rmeye cal�ssayd�k 
		//v�rgullu k�sm� d�rek yok say�cakt�.
		
		
		
		
		
	}

}
