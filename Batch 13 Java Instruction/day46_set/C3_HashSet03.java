package day46_set;

import java.util.HashSet;
import java.util.Set;

public class C3_HashSet03 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("B");
		set1.add("A");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("C");
		set1.add("B");

		System.out.println(set1);

		set1.clear();
		System.out.println(set1); // []
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		System.out.println(set1); // [A, B, F]

		Set<String> set2 = new HashSet<>();

		set2.add("B");
		set2.add("F");
		set2.add("A");

		System.out.println(set2);

		System.out.println(set2.containsAll(set1)); // true döndürdü

		System.out.println(set1.equals(set2)); // true

	//	set1.removeAll(set2); // bu method set1 içerisinde eðer set2 elemanlarý var ise bu set1 içerisinden
								// set2 elemanlarýný siliyor.
	//	System.out.println(set1.removeAll(set2)); // 

		System.out.println(set1); // []
		System.out.println(set2); // [A, B, F]
		
		
		set1.retainAll(set2); // set1 de çalýþýr set2 de olan elemanlarý tutar ve 
		                      // set 2 de olmayan elemanlarý siler.
		                      // Bir nevi set1 'i set2 'ye eþitlemiþ oluyoruz.
		
		System.out.println(set1); // [A, B, F]
		System.out.println(set2); // [A, B, F]
		
		

	}

}
