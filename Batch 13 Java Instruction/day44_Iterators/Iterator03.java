package day44_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {
	/*
	 * Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program
	 * yaziniz … (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz) Orn :
	 * [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil) output:
	 * [23,40]
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

		ListIterator it1 = sayiList.listIterator(); // burada yaptýgýmýzsayýlarý döndürdük yine ama next()'i bu sefer
													// bir degere atadýk çünkü if içerisinde iki kere next() yazamazdýk
													// bu sefer imleç içeride yanlýþ dönerdi bu sebeple atama yapýp
													// if'in içerisine çektik. Ve belirledigimiz aralýgý remove() ile
													// sildik.

		while (it1.hasNext()) {

			int temp = (int) it1.next();

			if (temp < 20 || temp > 40) {
				it1.remove();
			}

		}
		System.out.println(sayiList);

	}

}
