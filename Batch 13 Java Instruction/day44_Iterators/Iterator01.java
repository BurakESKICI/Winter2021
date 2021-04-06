package day44_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list); // [A, B, C, d]
		
		// her eleman B harfini ekleyelim
		
		for (String each : list) {
			each += "B";
			System.out.print(each+ ",");
		}
		System.out.println(" ");
		System.out.println(list);
		
		//Collections'da her yapi index'i desteklemez.Orneðin Set'de index olmaz
		// Index olmayýnca mecburen tüm elemanlara ulaþmak için For-each  loop kullanýlýr
		// for-each loop ile de update veya delete eyapamayýz.
		// bunun için java Iterator class'ýný oluþturmustur.....
		
		Iterator it1 = list.iterator();
		
		//next(), hasNext(), remove(), method'larina sahiptir.
		// listedeki tum elemanlari iterator kullanarak silelim
		
		
		while (it1.hasNext()) {
			 it1.next();
			 it1.remove();
			 
		}
		System.out.println(list);

	}

}
