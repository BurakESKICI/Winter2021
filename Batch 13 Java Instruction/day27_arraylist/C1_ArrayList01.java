package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C1_ArrayList01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");

		System.out.println(list);

		System.out.println(list.size());

		// list.remove(1);
		// index'i 1 olan can� silicek ayn� zamanda d�nd�r�rde
		// bununda syso yaparak g�rebiliriz
		System.out.println(list.remove(1));

		System.out.println(list.remove("Ayse")); // burada ayseyi siler ve sonucolarak true verir

		System.out.println(list);

		String isim = "Ali";
		isim.toLowerCase();
		System.out.println(isim);// burada ali ismini A'sini kucultemed�m cunku Java String methodlar� ile
									// String'i degistirmiyor ancak ve ancak atam yapmamm�z laz�m

		
		
		
		
	}

}
