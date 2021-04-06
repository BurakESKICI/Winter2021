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

		ListIterator li1 = list.listIterator(); // þimdi burada iteratorumuzu olusturduk,ardýndan iterator'de
												// kullanabildigimiz while ile döngü olusturucagýz ve String ile bir
												// deger atayýp bu degeri while'ýn içerisinde tek tek ilerlesin diye
												// next() kullandýk ve ardýndan istedigimiz Stringi eklemek için set()
												// method'unu kullandýk ve her satýra istedigimiz Stringi ekledik.....
												// bu arada ek olarak hasNext yapýyoruz bunu yaparaken sunu soruyor
												// yanýnda eleman varmý yaný cevap true veya false olarak dönüyor son
												// satýra gelip yanýnda eleman göremeyince false dönüyor ve döngü
												// kýrýlýyor :D.........................................................
												// NOT bu iþlem for loop ile yapýlabilir ama for loop index döndürür.
												// yani Collections'da index yapýsýný desteklemeyen bir
												// element'de for loop kullanýlamaz

		while (li1.hasNext()) {

			String temp = (String) li1.next();
			li1.set(temp + "B");

		}
		System.out.println(list);

	}

}
