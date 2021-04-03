package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);

		// toplama(list); varargs esnek oldugu ýcýn list'e benzese'de list degildir.

		int arr[] = { 15, 20, 25 };
		toplama(arr); // varargs array olarak calýssýr ve argument olarak array yollanabilir

		// kullanýcýdan deger alarak varargs calýstýrmak ýstýyorsak gýrýlen degerlerý
		// býr array'e kaydetmelýyýz
		// bunun icin kullanýcýdan aldýgýmýz degerlerý esnek oldugu ýcýn býr lýst'e koyarýz
		// sonra lýst'ý array'e cevýrýrýz.

	}

	public static void toplama(int... i) {
		int toplam = 0;
		for (int each : i) {
			toplam += each;
		}
		System.out.println(toplam);

	}

}
