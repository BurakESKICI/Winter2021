package day44_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {
	/*
	 * Iterator kullanarak listenin elemanlar�n� sondan ba�a do�ru yazd�r�n
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

		System.out.println(sayiList); // normal s�ral�ycak

		ListIterator it1 = sayiList.listIterator(); // burada farkl� olarak ilk yapmam�z gereken imle�'imizi sona
													// g�t�rmemiz laz�m ��nk� ancak ozaman baslama noktas� sondan olur
													// ve basa dogru gel�r
		while (it1.hasNext()) {// burada benden sonra eleman varm diye bak�yor ve ileliyor
			it1.next();     // tam olarak burada sonra gelmi� olduk.
		}

		while (it1.hasPrevious()) { // burada benden �nce eleman varm� diye bak�yor
			
			System.out.print(it1.previous()+ ","); //burada da sonra basa gelirken yazd�rd�k.

		}

	}

}
