package day46_set;

import java.util.HashSet;
import java.util.Set;

public class C1_Set01 {

	public static void main(String[] args) {
		
		
		Set<String> set1= new HashSet<>();
		set1.add("B");
		set1.add("A");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("C");
		set1.add("B");
		System.out.println(set1); // [A, B, C] tekrarlý elemanlar ayný referans'a gitti.
		
		System.out.println(set1.hashCode()); //198
		
		// Set'de onemli olan ozellýk No duplication ve elemanin kümede var olup olmamasýdýr.
		// sýralama Set için önemli degildir.
		// Set için elemanlarý giridigimiz sirada verir veya elemanlarý natural sýralama ile verir
		//
		
		
		set1.add("M");
		set1.add("G");
		
		System.out.println(set1.hashCode());// 346 
		
		// Collections'da hashCode() method'u o collection içindeki tüm 
		// elemanalrýn hash Code'larýnýn toplamýný verir.
		
		

	}

}
