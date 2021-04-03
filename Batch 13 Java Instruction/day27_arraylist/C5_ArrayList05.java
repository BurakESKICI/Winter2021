package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class C5_ArrayList05 {

	public static void main(String[] args) {
		// Verilen bir Array'i liste nasýl cevirebiliriz ?

		Integer sayi[] = { 10, 12, 35, 60, 40 };

		List<Integer> list2 = Arrays.asList(sayi);

		System.out.println(list2);

		String arr[] = { "Ali", "Veli" };
		List<String> listArr = Arrays.asList(arr);
		System.out.println(listArr);

		// Bazen cok fazla elemaný olan bir liste olusturmamýz gerekir.
		// Bu durumda liste elemanlarýný tek tek eklemek yerine
		// elemaný bir Array'e ekler , sonra da array'i list'e cevirebiliriz.
		// ornek bir web sitesindeli tum urunelerý bir listeye ekliycek olsak

		// Ancak bu method ile arry'den cevýrdýgýmýz list esnek olmaz
		// (array'in ozellýkerlýný tasýr ) add(), remove(), clear(), gibi uzunlugu
		// etkýleyen methodlar KULLANILMAZ
		// Java bu degisimdeki Array ve List'i senkronize eder,birinde yaptýgýmýz
		// degýsýklýgý otomatýk olarak dýgerýnýde update eder.

		// sayi array ve list2 listesi senkron calýsýr, birinde yaptýgýmýz degýsýklýk
		// dýgerýnde ýslenýr

		sayi[1] = 5;

		System.out.println(Arrays.toString(sayi));
		System.out.println("list2 : " + list2);

		list2.set(2, 13);
		System.out.println("list2 :" + list2);
		System.out.println("array : " + Arrays.toString(sayi));

	}

}
