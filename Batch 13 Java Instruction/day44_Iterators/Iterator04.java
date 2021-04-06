package day44_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {
	/*
	 * Iterator kullanarak listenin elemanlarýný sondan baþa doðru yazdýrýn
	 */

	public static void main(String[] args) {

		List<Integer> sayiList = new ArrayList<>();

		sayiList.add(2);
		sayiList.add(13);
		sayiList.add(56);
		sayiList.add(23);
		sayiList.add(45);
		sayiList.add(14);
		sayiList.add(40);

		System.out.println(sayiList); // normal sýralýycak

		ListIterator it1 = sayiList.listIterator(); // burada farklý olarak ilk yapmamýz gereken imleç'imizi sona
													// götürmemiz lazým çünkü ancak ozaman baslama noktasý sondan olur
													// ve basa dogru gelýr
		while (it1.hasNext()) {// burada benden sonra eleman varm diye bakýyor ve ileliyor
			it1.next();     // tam olarak burada sonra gelmiþ olduk.
		}

		while (it1.hasPrevious()) { // burada benden önce eleman varmý diye bakýyor
			
			System.out.print(it1.previous()+ ","); //burada da sonra basa gelirken yazdýrdýk.

		}

	}

}
