package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);

		// toplama(list); varargs esnek oldugu �c�n list'e benzese'de list degildir.

		int arr[] = { 15, 20, 25 };
		toplama(arr); // varargs array olarak cal�ss�r ve argument olarak array yollanabilir

		// kullan�c�dan deger alarak varargs cal�st�rmak �st�yorsak g�r�len degerler�
		// b�r array'e kaydetmel�y�z
		// bunun icin kullan�c�dan ald�g�m�z degerler� esnek oldugu �c�n b�r l�st'e koyar�z
		// sonra l�st'� array'e cev�r�r�z.

	}

	public static void toplama(int... i) {
		int toplam = 0;
		for (int each : i) {
			toplam += each;
		}
		System.out.println(toplam);

	}

}
