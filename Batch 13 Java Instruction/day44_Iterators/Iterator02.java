package day44_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		System.out.println(list); // [A, B, C, d]

		// her elemana B harfini ekleyelim

		ListIterator li1 = list.listIterator(); // �imdi burada iteratorumuzu olusturduk,ard�ndan iterator'de
												// kullanabildigimiz while ile d�ng� olusturucag�z ve String ile bir
												// deger atay�p bu degeri while'�n i�erisinde tek tek ilerlesin diye
												// next() kulland�k ve ard�ndan istedigimiz Stringi eklemek i�in set()
												// method'unu kulland�k ve her sat�ra istedigimiz Stringi ekledik.....
												// bu arada ek olarak hasNext yap�yoruz bunu yaparaken sunu soruyor
												// yan�nda eleman varm� yan� cevap true veya false olarak d�n�yor son
												// sat�ra gelip yan�nda eleman g�remeyince false d�n�yor ve d�ng�
												// k�r�l�yor :D.........................................................
												// NOT bu i�lem for loop ile yap�labilir ama for loop index d�nd�r�r.
												// yani Collections'da index yap�s�n� desteklemeyen bir
												// element'de for loop kullan�lamaz

		while (li1.hasNext()) {

			String temp = (String) li1.next();
			li1.set(temp + "B");

		}
		System.out.println(list);

	}

}
