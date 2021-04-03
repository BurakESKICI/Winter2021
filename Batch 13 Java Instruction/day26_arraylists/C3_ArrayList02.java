package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		// List'in uzunlugu nas�l bulunur
		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);

		System.out.println(list);

		// ka� tane elemana sah�p oldugunu bulmak �c�n bu method kullan�l�r
		System.out.println(list.size());

		// bir eleman nas�l s�l�nr
		list.remove(1); // elemanlar� ilk atamalar�na g�re s�ralar ve ona g�re index'ini al�r ve remove
						// eder
		System.out.println(list);

		System.out.println(list.remove(2));// remove edilcek eleman� bulur ve yazd�r�r
		// remove (index kulland�g�m�zda o indexdeki eleman� remove eder ve bunun delili
		// olarak bize o eleman� getirir e�er olmayan bir index girersek RTE getirir.
		System.out.println(list);

		List<String> list2 = new ArrayList<>();
		list2.add("Ali");

		System.out.println(list2.remove("hasan"));// git hasan� kald�r dedik ama olmad�g� �c�n false verdi
		System.out.println(list2);

		// remove(Object) method'u kullan�ld�g�nda eger Java istenen eleman� bulup
		// remove ederse
		// bize remove edilen eleman� d�nd�r�r.listede bulamazsa istegin yerine
		// getirilemedigini anlamam�z i�in false d�nd�r�r.
		
		System.out.println(list2.remove("Ali"));

	}

}
