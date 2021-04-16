package day45_Collections;

import java.util.LinkedList;

public class C4_LinkedList04 {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList<>();

		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);
		
		ll1.contains("A"); // eger A iceriyorsa true dondurur.
		
		
		LinkedList<String> ll2 = new LinkedList<>();

		ll2.add("A");
		ll2.add("B");
		ll2.add("C");
		ll2.add("D");
		System.out.println(ll2);
		
		System.out.println(ll2.containsAll(ll1)); // ll1 'i iceriyormu diye soruyor true veya false verir ( true )
		
		
		System.out.println(ll2.get(2)); //2. index'deki elemaný bana getiricek burasý
		                                 // burada getFirst() kullanabilirim ve getLast().
		
		
		
		
		
	}

}
