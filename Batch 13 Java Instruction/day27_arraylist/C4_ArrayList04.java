package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C4_ArrayList04 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);

		List<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(10);
		

		// equals() method'u 2 listeyi hem elemanlar hemde elemanlarýn ýndexleri ile
		// karsýlastýrýr.
		//hem elemanlar hemde indexler eþit ise true döner. yoksa false döner. 
		System.out.println(list1.equals(list2)); // false

		// þimdi ikisini sýraladýk ve eþit olup olmadýgýna baktýk
		// NOT :list isin içerisine girdiginde Arrays.sort() yerine Collections.sort() kullanýyoruz
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1.equals(list2));
		
		
		list1.clear();
		System.err.println(list1);
		
		
	}

}
