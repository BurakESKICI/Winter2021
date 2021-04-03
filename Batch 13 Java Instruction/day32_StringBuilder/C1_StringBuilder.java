package day32_StringBuilder;

public class C1_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Rumeysa");
		System.out.println(sb1);

		sb1.append(" ").append("Cetinturk"); // verilen SB'in sonuna istedigimiz String degerlerini ekler
		System.out.println(sb1);
		
		String cumle="Javayi cok sever";
		sb1.append("Javayi cok sever", 6, 10); // Baska bir String 'den istedigimiz bolumu SB'in sonuna ekler,Ayr�ca
												// girilen index degerlerin ilki dahil ikinici dahil degil'dir oraya
												// kadard�r
		System.out.println(sb1); // Rumeysa Cetinturk cok

		System.out.println(sb1.length());// 21 Sb'in uzunluk bilgisini verir
		System.out.println(sb1.capacity()); // 23 (7 + 16) SB'in kapasitesi bilgisini verir

		System.out.println(sb1.charAt(1)); // u SB'in istedigimiz indexde olan karakterin bilgisini verir

		sb1.charAt(5); // Bize bilgi getiren methodlar SB'i degistirmez.
		System.out.println(sb1); // Rumeysa Cetinturk cok

		sb1.delete(17, 21); // SB'in istedigimiz index'lerin aras�ndaki kismi siler
		System.out.println(sb1);

		sb1.deleteCharAt(16); // SB'in istedigimiz index'deki karakteri siler
		System.out.println(sb1); // Rumeysa Cetintur

		String isim = "Rumeysa Cetintur";
		System.out.println(sb1.equals(isim)); // i�erikler ayn� olsa bile elma ile armut k�yaslanmayacag� i�in false
												// verir, �imdi ikiside obje olsa da ikisi farkl� objeler farkl� data
												// t�rlerine sahip yani referanslar� elbette farkl� olucakt�.

		StringBuilder sb2 = new StringBuilder("Rumeysa Cetintur");

		System.out.println(sb1 == sb2); // new kelimesini g�rdugum an yen� obje geld�g�n� anlamam laz�m ve yen� referans
										// oldugunu b�lmem laz�m
		System.out.println(sb1.equals(sb2)); // StrinBuilder'da equals method'u String'den farkl� cal�s�r ancak ayn�
												// obje ile k�yasland�g�ndad true ver�r (yan� ancak kend�s� ile true
												// verir!)
												// String'deki == gibi �al�s�r
		System.out.println(sb1.equals(sb1)); // true

		System.out.println(sb1.indexOf("Cetin")); // 8
		System.out.println(sb1.indexOf("e", 6)); // 6 'dan sonra ilk buldugu yer 9.index'tir.

		System.out.println(sb1.indexOf("Kaz�m"));// olmad�g� �c�n -1 verdi

		sb1.insert(7, " "); // istedigimiz index'den itibaren istenen String'i ekler :D

		System.out.println(sb1);// Rumeysa Cetintur

		cumle = "Merhaba dunya";
		sb1.insert(0, cumle, 0, 8); // sb1.insert(index, str, offset, len)
									// 0 :Sb'a hangi index'den itibaren eklenecek
									// cumle : Hangi String'den eklenecek
									// 0 : cumlenin hangi indexinden baslanacak
									// 8 : bitis indexi

		sb1.insert(25, cumle, 8, 13);

		System.out.println(sb1); // Merhaba Rumeysa Cetinturdunya

		System.out.println(sb1.lastIndexOf("t")); // 22 ( en sonki t hangi index'de onu verir)
		System.out.println(sb1.lastIndexOf("a", 22)); // 14 verdi ( yani 22.indexteki karakterden �nce gelen ilk a hangi
														// index'deyse onu verir

		sb1.replace(8, 16, "Seher"); // Rumeysa yerine Seher koymus olduk :D
		System.out.println(sb1); // Merhaba Seher Cetinturdunya

		sb1.reverse();
		System.out.println(sb1); // aynudrutniteC reheS abahreM
		sb1.reverse();

		sb1.setCharAt(10, 'k');
		System.out.println(sb1); // Merhaba Seker Cetinturdunya

		System.out.println(sb1.subSequence(8, 13)); // Seker ( istedigimiz indexler ara�ndaki b�l�m�n� verir)

		System.out.println(sb1.substring(8)); // Seker Cet�nturdunya ( ba�lang�c noktas�n� b�z ver�yoruz verdigimiz
												// noktadan ger�s�n� ya�r�yor

		System.out.println(sb1.length()); // 27
		System.out.println(sb1.capacity()); // 48
		sb1.trimToSize();// SB i�in haz�rlanan kapasitedeki fazlal�klar� siler length ile kapasiteyi esit
							// duruma getirir
		System.out.println(sb1.length()); // 27
		System.out.println(sb1.capacity());// 27

		StringBuilder sb5 = new StringBuilder("Ali okula gel");
		StringBuilder sb6 = new StringBuilder("Abi okula gel");
		System.out.println(sb5.compareTo(sb6)); // 10 // arasindaki fark 10 diyor, b ile l arasinda c d e f g h i j k 9
												// var harf var, 10. harf m
												// Esit olmayan ilk harf 10 karakter farklidir anlamindadir. Sadece ILK
												// farkli
												// olan degerlerin ASCII farkini verir
		
		
		

	}

}
