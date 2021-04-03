package day05_wrapperandconcatenation;

public class C2_WrapperClass {

	public static void main(String[] args) {
		
		
		//Java'da 2 t�r Data tipi vard�r
		//primitive ve Non-Primitive
		//primitive le sadece value(deger ) i�eriri.
		//non-primitive ise value (deger) ve Method i�erir.
		//�rnek
		
		String isim= "Burak";
		//toUpperCase harflerin hepsini b�y�k yapmaya yar�yor ilk ders denbilgi
		
		System.out.println(isim.toUpperCase());
		
		//Wrapepr Class : Java'n�n primitive data turler� ile baz� methodlari
		//                kullanab�lmem�z �c�n olusturdugu Class'lard�r.
		
		//boolen, char, byte ,short, int, long, float, double, 
		
		byte num= 10;
		System.out.println(num);
		
		Byte num2=11; //ismen primitive data t�r� ile ayni olan non-primitive 
		//datalara warapper denir.
		System.out.println(num2);
		//ve yazd�rd�g�nda okur
		
		Byte byteMinNum =   Byte.MIN_VALUE;
		System.out.println(byteMinNum);
		//burada yapt�g�m�z mesela byte�n ne kucuk deger�n�n-128 oldguunu b�l�yruz ama
		//mesela longun b�lm�yoruz veya d�ger primitvelerin ezberlememek yer�ne kod �le c�kart�yoruz
		
		Byte byteMaxNum = Byte.MAX_VALUE;
		System.out.println(byteMaxNum);
		// max deger de bu sek�lde 
		
		
		// variable olusturmadan d�rek olarak short'un en kucuk ve en buyuk degerler�n� yazal�m
		
		Short shortMaxNum = Short.MAX_VALUE;
		System.out.println(shortMaxNum);
		
		Short shortMinNum = Short.MIN_VALUE;
		System.out.println(shortMinNum);
		
		//integer veri t�r�n�n wrapper class'i integer
		//en buyuk ve en kucuk �nteger degerler� yaz
		
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
