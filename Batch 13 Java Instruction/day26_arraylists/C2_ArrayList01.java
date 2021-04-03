package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayList01 {

	public static void main(String[] args) {

		// bir ArrayList nasýl olusturulur
		// ArrayList bir objedir.dolayýsýyla yeni bir tane olusturmak için new keyword
		// kullanmalýyýz

		// 1.yol
		ArrayList<String> list = new ArrayList<String>();

		// 2.yol

		ArrayList<String> list2 = new ArrayList<>();

		// 3.yol ne çok kullanýlan çeþidi budur

		// declaration deðer kýsa bir hatýrlatma
		List<String> list3 = new ArrayList<>();

		// NOT : eðer constructor olarak List<>() kullanýlýrsa CTE olarak veriri

		// List<String> list4 = new List<>();

		// olusturdugumuz Class isimleri Java'da kullanýlan obje isimleri ile AYNI
		// OLMAMALIDIR.

		// List'e eleman ekleme
		// List olustururken otomatik olarak eleman ekleme ozellýgý yoktur
		// elemanlarýn tek tek eklenemesi gerekir.

		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayse");

		// list nasýl yazdýrýlýr ?

		System.out.println(list3); // [Ali, Veli, Ayse ]

		list3.add(1, "Can"); // Aliden sonra koymak istedigim icin index'ini belirtip sonrasýnda koymak
								// istedigim degeri girdim

		System.out.println(list3);
		
		list3.add(1, "Fatma");
		
		System.out.println(list3);
		
		/*
        Soru 6) Verilen bir Array’den istenen degere esit olan elamanlari kaldirip, 
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
