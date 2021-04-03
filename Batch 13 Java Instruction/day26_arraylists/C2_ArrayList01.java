package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayList01 {

	public static void main(String[] args) {

		// bir ArrayList nas�l olusturulur
		// ArrayList bir objedir.dolay�s�yla yeni bir tane olusturmak i�in new keyword
		// kullanmal�y�z

		// 1.yol
		ArrayList<String> list = new ArrayList<String>();

		// 2.yol

		ArrayList<String> list2 = new ArrayList<>();

		// 3.yol ne �ok kullan�lan �e�idi budur

		// declaration de�er k�sa bir hat�rlatma
		List<String> list3 = new ArrayList<>();

		// NOT : e�er constructor olarak List<>() kullan�l�rsa CTE olarak veriri

		// List<String> list4 = new List<>();

		// olusturdugumuz Class isimleri Java'da kullan�lan obje isimleri ile AYNI
		// OLMAMALIDIR.

		// List'e eleman ekleme
		// List olustururken otomatik olarak eleman ekleme ozell�g� yoktur
		// elemanlar�n tek tek eklenemesi gerekir.

		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayse");

		// list nas�l yazd�r�l�r ?

		System.out.println(list3); // [Ali, Veli, Ayse ]

		list3.add(1, "Can"); // Aliden sonra koymak istedigim icin index'ini belirtip sonras�nda koymak
								// istedigim degeri girdim

		System.out.println(list3);
		
		list3.add(1, "Fatma");
		
		System.out.println(list3);
		
		/*
        Soru 6) Verilen bir Array�den istenen degere esit olan elamanlari kaldirip, 
        kalanlari yeni bir Array olarak yazdiran bir method yaziniz
        */
       
       int arr[]= {2,3,5,3,6,4,3,6,7};
       int sayi=5;
		
       List<Integer> istenenList= new ArrayList<>();
       
       for (int i = 0; i < arr.length; i++) {
		if (arr[i]!=sayi) {
			istenenList.add(arr[i]);
		}
	}
       System.out.println(istenenList);

	}

}
