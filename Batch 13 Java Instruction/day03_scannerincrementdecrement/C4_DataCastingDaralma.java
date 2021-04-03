package day03_scannerincrementdecrement;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double bir degisken olusturalım ve bunu ınteger ve byte cevırelım

		double numDouble = 50;
		
		int numInt =(int) numDouble;
		
		System.out.println("integer degısken degerı :" + numInt);
		
		byte numByte = (byte)numDouble;
		//daha dar (narrow) bir data tipine cevvırırken eger datatipinin sinirindan 
		//büyükse saymaya negatıf en kucuk sayıdan devam eder ,istnen sayıya gelınceye
		//kadar tekrar tekrar en kucuk negatıf sayıya gıder.
		
		System.out.println("byte degısken degerı : " +numByte );
		
		// eğer double bir sayıda virgullü olup da cevırmeye calıssaydık 
		//vırgullu kısmı dırek yok sayıcaktı.
		
		
		
		
		
	}

}
