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
		System.out.println(set1); // [A, B, C] tekrarl� elemanlar ayn� referans'a gitti.
		
		System.out.println(set1.hashCode()); //198
		
		// Set'de onemli olan ozell�k No duplication ve elemanin k�mede var olup olmamas�d�r.
		// s�ralama Set i�in �nemli degildir.
		// Set i�in elemanlar� giridigimiz sirada verir veya elemanlar� natural s�ralama ile verir
		//
		
		
		set1.add("M");
		set1.add("G");
		
		System.out.println(set1.hashCode());// 346 
		
		// Collections'da hashCode() method'u o collection i�indeki t�m 
		// elemanalr�n hash Code'lar�n�n toplam�n� verir.
		
		

	}

}
