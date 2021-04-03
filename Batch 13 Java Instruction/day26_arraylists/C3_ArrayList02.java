package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		// List'in uzunlugu nasýl bulunur
		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);

		System.out.println(list);

		// kaç tane elemana sahýp oldugunu bulmak ýcýn bu method kullanýlýr
		System.out.println(list.size());

		// bir eleman nasýl sýlýnr
		list.remove(1); // elemanlarý ilk atamalarýna göre sýralar ve ona göre index'ini alýr ve remove
						// eder
		System.out.println(list);

		System.out.println(list.remove(2));// remove edilcek elemaný bulur ve yazdýrýr
		// remove (index kullandýgýmýzda o indexdeki elemaný remove eder ve bunun delili
		// olarak bize o elemaný getirir eðer olmayan bir index girersek RTE getirir.
		System.out.println(list);

		List<String> list2 = new ArrayList<>();
		list2.add("Ali");

		System.out.println(list2.remove("hasan"));// git hasaný kaldýr dedik ama olmadýgý ýcýn false verdi
		System.out.println(list2);

		// remove(Object) method'u kullanýldýgýnda eger Java istenen elemaný bulup
		// remove ederse
		// bize remove edilen elemaný döndürür.listede bulamazsa istegin yerine
		// getirilemedigini anlamamýz için false döndürür.
		
		System.out.println(list2.remove("Ali"));

	}

}
