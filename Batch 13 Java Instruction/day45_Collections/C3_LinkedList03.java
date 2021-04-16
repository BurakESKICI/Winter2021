package day45_Collections;

import java.util.LinkedList;

public class C3_LinkedList03 {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);
		
		 ll1.remove(0); // 0. index'i silicek(A'n�n kellesi uctu)
	  //System.out.println(	ll1.remove(0)); ==> A // sildigi eleman� donduruyormus bu remove method'u 
		 ll1.add("A");
			ll1.add("B");
			System.out.println(ll1); // [B, A, B]
			
			System.out.println(ll1.remove("B")); // buar true dondurur orda B'yi buldu sildi buna true dedi
			System.out.println(ll1);
			ll1.addFirst("B"); // yine eklmis oldum 2. B'yi
			System.out.println(ll1);
			ll1.removeFirstOccurrence("B"); // burada ilk s�rada kiB yi silicek �nce gelen yani
			System.out.println(ll1);
			System.out.println(ll1.remove()); // s�radaki ilk eleman� siliyor sadece remove() yapt�g�mda :D
			
			
			/**NOOT** :
			 * Eger listemiz integer'lardan olusuyorsa parantez icine yazd�g�m�z say�n�n index'i yoksa 
			 * sayi mi oldugunu kar�st�rmamak icin java parantez icine yaz�lan� index olarak kabul eder.
			 */
			
			

	}

}
