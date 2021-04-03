package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {

		/*
		 * Array (Dizi) : Java'da birden fazla variable store etmek i�in kullan�lan
		 * objelerden biridir. //Array olu�turulurken 2 �eyi declare etmeliyiz: //1-
		 * data type(Bir array'in i�erisinde sadece ayn� data tipinden elemanlar
		 * olabilir.) 2- uzunluk array'in i�erisine konulcak maximum eleman say�s��n�
		 * belirtir ve bunda fazlas�n� koymak istersek RTE verir.
		 */

		int arr[] = { 10, 23, 54 }; // length =3
		String isimler[] = new String[4]; // length=4 olan bo� bir array olu�turur

		// Array'de primitive datalar veya non-primitive datalar�n referanslar� store
		// edilebilir.
		// Mesela isimler array'inin i�inde isim degerleri degil ,isimlerin referanslar�
		// olur.

		// array'in elemanlar�na ula�ma ve update etme

		System.out.println(isimler[1]);
		isimler[2] = "Boss";
		isimler[0] = "Elveda";

		// Array'in t�m elelmanlar�n� yazd�rma
		System.out.println(isimler); // bu isimlerin stack memory 'de bir referans� olur ve ekrana o referans�
										// yazd�r�r.
		System.out.println(Arrays.toString(isimler));// bu �ekilde de heap'in i�indeki yai referans� de�il direk objenin
														// kendini yazd�r�r.

		// method kullanmadan t�m elemanlar� yazd�ral�m
		// loop kullanmam�z laz�m

		for (int i = 0; i < isimler.length; i++) {

			System.out.print(isimler[i] + ",");

		}

		System.out.println(Arrays.toString(arr)); // direk heap deki degerlini getirdi ��nk� �a��rma kodunu yazd�k

		System.out.println(arr); // referans gelir

		//Array'in elemanlar�n� nas�l s�ralayabiliriz.
		
		isimler[1]="Burak";
		isimler[3]="Furkan";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
	}

}
