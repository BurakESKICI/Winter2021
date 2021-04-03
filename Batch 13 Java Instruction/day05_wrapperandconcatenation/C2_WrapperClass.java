package day05_wrapperandconcatenation;

public class C2_WrapperClass {

	public static void main(String[] args) {
		
		
		//Java'da 2 tür Data tipi vardýr
		//primitive ve Non-Primitive
		//primitive le sadece value(deger ) içeriri.
		//non-primitive ise value (deger) ve Method içerir.
		//örnek
		
		String isim= "Burak";
		//toUpperCase harflerin hepsini büyük yapmaya yarýyor ilk ders denbilgi
		
		System.out.println(isim.toUpperCase());
		
		//Wrapepr Class : Java'nýn primitive data turlerý ile bazý methodlari
		//                kullanabýlmemýz ýcýn olusturdugu Class'lardýr.
		
		//boolen, char, byte ,short, int, long, float, double, 
		
		byte num= 10;
		System.out.println(num);
		
		Byte num2=11; //ismen primitive data türü ile ayni olan non-primitive 
		//datalara warapper denir.
		System.out.println(num2);
		//ve yazdýrdýgýnda okur
		
		Byte byteMinNum =   Byte.MIN_VALUE;
		System.out.println(byteMinNum);
		//burada yaptýgýmýz mesela byteýn ne kucuk degerýnýn-128 oldguunu býlýyruz ama
		//mesela longun býlmýyoruz veya dýger primitvelerin ezberlememek yerýne kod ýle cýkartýyoruz
		
		Byte byteMaxNum = Byte.MAX_VALUE;
		System.out.println(byteMaxNum);
		// max deger de bu sekýlde 
		
		
		// variable olusturmadan dýrek olarak short'un en kucuk ve en buyuk degerlerýný yazalým
		
		Short shortMaxNum = Short.MAX_VALUE;
		System.out.println(shortMaxNum);
		
		Short shortMinNum = Short.MIN_VALUE;
		System.out.println(shortMinNum);
		
		//integer veri türünün wrapper class'i integer
		//en buyuk ve en kucuk ýnteger degerlerý yaz
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

	}

}
