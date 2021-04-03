package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {

		/*
		 * Array (Dizi) : Java'da birden fazla variable store etmek için kullanýlan
		 * objelerden biridir. //Array oluþturulurken 2 þeyi declare etmeliyiz: //1-
		 * data type(Bir array'in içerisinde sadece ayný data tipinden elemanlar
		 * olabilir.) 2- uzunluk array'in içerisine konulcak maximum eleman sayýsýýný
		 * belirtir ve bunda fazlasýný koymak istersek RTE verir.
		 */

		int arr[] = { 10, 23, 54 }; // length =3
		String isimler[] = new String[4]; // length=4 olan boþ bir array oluþturur

		// Array'de primitive datalar veya non-primitive datalarýn referanslarý store
		// edilebilir.
		// Mesela isimler array'inin içinde isim degerleri degil ,isimlerin referanslarý
		// olur.

		// array'in elemanlarýna ulaþma ve update etme

		System.out.println(isimler[1]);
		isimler[2] = "Boss";
		isimler[0] = "Elveda";

		// Array'in tüm elelmanlarýný yazdýrma
		System.out.println(isimler); // bu isimlerin stack memory 'de bir referansý olur ve ekrana o referansý
										// yazdýrýr.
		System.out.println(Arrays.toString(isimler));// bu þekilde de heap'in içindeki yai referansý deðil direk objenin
														// kendini yazdýrýr.

		// method kullanmadan tüm elemanlarý yazdýralým
		// loop kullanmamýz lazým

		for (int i = 0; i < isimler.length; i++) {

			System.out.print(isimler[i] + ",");

		}

		System.out.println(Arrays.toString(arr)); // direk heap deki degerlini getirdi çünkü çaðýrma kodunu yazdýk

		System.out.println(arr); // referans gelir

		//Array'in elemanlarýný nasýl sýralayabiliriz.
		
		isimler[1]="Burak";
		isimler[3]="Furkan";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
	}

}
