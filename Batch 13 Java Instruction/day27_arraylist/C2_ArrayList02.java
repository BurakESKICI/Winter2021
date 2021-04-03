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

		list.set(2, "Kemal"); // 2.index'e kemali eklemiþ oldu
		System.out.println(list);

		list.set(0, "Semih");
		System.out.println(list); // semihi eklemiþ oldu 0 indexine

		// eger olmayan bir indexi yani normal sayýsýndan fazla olan bir indexi girersek
		// Java RTE verir
		// list.set(4, "Mustafa"); ==>örnek

		list.add(2, "Yasin"); // bu method ise direk olarak ekler yani listeyi uzatabliriz.
		System.out.println(list);

		// ayrýca mesela liste de 5 tane eleman varken gidipte su sekýlde
		// yazamayýz(örnek asagýda)
		//list.add(10,"Sefer"); // size 'dan buyuk ýndex kabul etmez
		
		System.out.println(list.contains("kemal")); // true 
		
		list.contains("Cemal"); // bize boolean bir sonuc verir sonuc degýsmez 
		
		// list'in elemanlarýný sýralayýnýz
		Collections.sort(list);
		
		System.out.println(list);
		

	}

}
