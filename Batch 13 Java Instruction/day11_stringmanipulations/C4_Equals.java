package day11_stringmanipulations;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2'yi kars�last�r�r ve String olarak es�t olup 
		//olmad�klar�na bakar
		//sonuc olarak true veya false d�nd�r�r.(sonuc)
		
		// baz� methodlar�n yapt�klar� �slem �le dondurdukler� sonuc farkl� olab�l�r
		// b�r method da ggit ali elementi sil deriz.
		//o da gidip ali yi bulur ve siler.
		
		String str="Ali Can";
		String str2="Ali Can";
		
		//str ile str2'nin e�it olup olmad�g�n� yazd�r�n
		
		System.out.println(str.equals(str2));// true
		
		System.out.println(str.equals(str2) ? "e�it" : "e�it de�il");
		
		//Java'da String'ler case senstive'dir.(buyuk kucuk harf duyarl�d�r
		//b�r harf bile deg�sse esit olmaz Stringler
		

	}

}
