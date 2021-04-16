package day45_Collections;

import java.util.LinkedList;

public class C3_LinkedList03 {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);
		
		 ll1.remove(0); // 0. index'i silicek(A'nýn kellesi uctu)
	  //System.out.println(	ll1.remove(0)); ==> A // sildigi elemaný donduruyormus bu remove method'u 
		 ll1.add("A");
			ll1.add("B");
			System.out.println(ll1); // [B, A, B]
			
			System.out.println(ll1.remove("B")); // buar true dondurur orda B'yi buldu sildi buna true dedi
			System.out.println(ll1);
			ll1.addFirst("B"); // yine eklmis oldum 2. B'yi
			System.out.println(ll1);
			ll1.removeFirstOccurrence("B"); // burada ilk sýrada kiB yi silicek önce gelen yani
			System.out.println(ll1);
			System.out.println(ll1.remove()); // sýradaki ilk elemaný siliyor sadece remove() yaptýgýmda :D
			
			
			/**NOOT** :
			 * Eger listemiz integer'lardan olusuyorsa parantez icine yazdýgýmýz sayýnýn index'i yoksa 
			 * sayi mi oldugunu karýstýrmamak icin java parantez icine yazýlaný index olarak kabul eder.
			 */
			
			

	}

}
