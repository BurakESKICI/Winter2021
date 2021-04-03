package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class C5_ArrayList05 {

	public static void main(String[] args) {
		// Verilen bir Array'i liste nas�l cevirebiliriz ?

		Integer sayi[] = { 10, 12, 35, 60, 40 };

		List<Integer> list2 = Arrays.asList(sayi);

		System.out.println(list2);

		String arr[] = { "Ali", "Veli" };
		List<String> listArr = Arrays.asList(arr);
		System.out.println(listArr);

		// Bazen cok fazla eleman� olan bir liste olusturmam�z gerekir.
		// Bu durumda liste elemanlar�n� tek tek eklemek yerine
		// eleman� bir Array'e ekler , sonra da array'i list'e cevirebiliriz.
		// ornek bir web sitesindeli tum uruneler� bir listeye ekliycek olsak

		// Ancak bu method ile arry'den cev�rd�g�m�z list esnek olmaz
		// (array'in ozell�kerl�n� tas�r ) add(), remove(), clear(), gibi uzunlugu
		// etk�leyen methodlar KULLANILMAZ
		// Java bu degisimdeki Array ve List'i senkronize eder,birinde yapt�g�m�z
		// deg�s�kl�g� otomat�k olarak d�ger�n�de update eder.

		// sayi array ve list2 listesi senkron cal�s�r, birinde yapt�g�m�z deg�s�kl�k
		// d�ger�nde �slen�r

		sayi[1] = 5;

		System.out.println(Arrays.toString(sayi));
		System.out.println("list2 : " + list2);

		list2.set(2, 13);
		System.out.println("list2 :" + list2);
		System.out.println("array : " + Arrays.toString(sayi));

	}

}
