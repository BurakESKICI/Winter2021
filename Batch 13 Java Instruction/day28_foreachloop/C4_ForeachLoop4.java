package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForeachLoop4 {

	public static void main(String[] args) {
		/*
		 * iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each
		 * loop kullanarak bulunuz. Sonucu ekrana yazdiriniz. Ortak eleman yoksa ekrana
		 * “Ortak eleman yok” yazdiriniz
		 * 
		 */
		
		String arr1[]= {"Alix","Can","Ayse","Seherx"};
		String arr2[]= {"Ali","Veli","Mesut","Seher","Sedat"};
		
		//Ortak elemanlarý koymak ýcýn bir List olusturalým
		List <String> ortakElemanlar=new ArrayList<>();
		
		for (String each : arr1) {
			for (String each1 : arr2) {
				if (each1.equals(each)) {
					ortakElemanlar.add(each);
				}
			}
		}
		if (ortakElemanlar.isEmpty()) {
			System.out.println("Ortak eleman yok");
		} else {
			System.out.println(ortakElemanlar);
		}
		

		
		
	}

}
