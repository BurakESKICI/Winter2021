package day11_stringmanipulations;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2'yi karsýlastýrýr ve String olarak esýt olup 
		//olmadýklarýna bakar
		//sonuc olarak true veya false döndürür.(sonuc)
		
		// bazý methodlarýn yaptýklarý ýslem ýle dondurduklerý sonuc farklý olabýlýr
		// býr method da ggit ali elementi sil deriz.
		//o da gidip ali yi bulur ve siler.
		
		String str="Ali Can";
		String str2="Ali Can";
		
		//str ile str2'nin eþit olup olmadýgýný yazdýrýn
		
		System.out.println(str.equals(str2));// true
		
		System.out.println(str.equals(str2) ? "eþit" : "eþit deðil");
		
		//Java'da String'ler case senstive'dir.(buyuk kucuk harf duyarlýdýr
		//býr harf bile degýsse esit olmaz Stringler
		

	}

}
