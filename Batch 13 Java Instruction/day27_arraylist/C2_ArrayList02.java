package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C2_ArrayList02 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		System.out.println(list);

		list.set(2, "Kemal"); // 2.index'e kemali eklemi� oldu
		System.out.println(list);

		list.set(0, "Semih");
		System.out.println(list); // semihi eklemi� oldu 0 indexine

		// eger olmayan bir indexi yani normal say�s�ndan fazla olan bir indexi girersek
		// Java RTE verir
		// list.set(4, "Mustafa"); ==>�rnek

		list.add(2, "Yasin"); // bu method ise direk olarak ekler yani listeyi uzatabliriz.
		System.out.println(list);

		// ayr�ca mesela liste de 5 tane eleman varken gidipte su sek�lde
		// yazamay�z(�rnek asag�da)
		//list.add(10,"Sefer"); // size 'dan buyuk �ndex kabul etmez
		
		System.out.println(list.contains("kemal")); // true 
		
		list.contains("Cemal"); // bize boolean bir sonuc verir sonuc deg�smez 
		
		// list'in elemanlar�n� s�ralay�n�z
		Collections.sort(list);
		
		System.out.println(list);
		

	}

}
