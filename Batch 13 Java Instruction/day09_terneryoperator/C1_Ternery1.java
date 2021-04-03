package day09_terneryoperator;

public class C1_Ternery1 {

	public static void main(String[] args) {
		
		// ternery islemi bir sonuc dondurdugundan bir variable olusturup ona assign etmeliyiz
		
		
		int sayi=101;
		
		String sonuc = (sayi%2==0) ? "cift sayi" : "tek sayi";
		System.out.println(sonuc);
		
		//ben bir variable'ye assign etmek istemezsem 
		//ozaman syso icine yazabilirim
		
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		
		//basina aciklama yazmak icin
		
		System.out.println("islemin sonucu : "+ (sayi%2==0 ? "cift sayi" : "tek sayi" ));

	}

}
