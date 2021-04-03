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
		

		// equals() method'u 2 listeyi hem elemanlar hemde elemanlar�n �ndexleri ile
		// kars�last�r�r.
		//hem elemanlar hemde indexler e�it ise true d�ner. yoksa false d�ner. 
		System.out.println(list1.equals(list2)); // false

		// �imdi ikisini s�ralad�k ve e�it olup olmad�g�na bakt�k
		// NOT :list isin i�erisine girdiginde Arrays.sort() yerine Collections.sort() kullan�yoruz
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1.equals(list2));
		
		
		list1.clear();
		System.err.println(list1);
		
		
	}

}
