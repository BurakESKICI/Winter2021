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
		
		//Collections'da her yapi index'i desteklemez.Orne�in Set'de index olmaz
		// Index olmay�nca mecburen t�m elemanlara ula�mak i�in For-each  loop kullan�l�r
		// for-each loop ile de update veya delete eyapamay�z.
		// bunun i�in java Iterator class'�n� olu�turmustur.....
		
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
