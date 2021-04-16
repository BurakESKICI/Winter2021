package day45_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		// linked bagli demektir
		// linked list'te tum elemanlar birbirine tren gibi baglıdır.

		// her linked list bir "head" ile başlar "head" içerisinde sadece adrres vardır
		// bundan
		// sonraki her bir eleman bir "adres parcacıgı" ve birde "deger" olusturur bu
		// kısmada
		// node denir.
		// Ve son vagonda adres olarak null gösterir arkasında gösterecegi vagon
		// kalmadıgı icin
		// ve ben bir vagonu cıkardıgımda bir arkasındaki vagonun adresi gelir basitce
		// tren mantıgı hepsi.
		// ama söyle bir gercek var biz yazdırdıgımızda ekranda adres degil tabikide
		// valuue(deger) cıkıcaktır
		// o adres'ler javanın arka plandaki calisma mantıgı olarak anlattık.

		// *B*// KISA BIR NOT: Interface'lerde obje olusturamıyoruz abstract'larda da
		// hatırlarsak Listg<String> liste= new ArrayList<>(); yapıyorduk yani list
		// interface oldugu için biz onun constructorunu bir class'a atıyorduk ve obje
		// olusturabılıyorduk.

		// *M*
		/*
		 * Collection'da obje olustururken olsuturmak istedigimiz collection'in class mi
		 * yoksa inteface'mi olduguna bakmalıyız data turu olarak o interface'i
		 * constructor olarak ise uygun bir class secmeliyiz simdiye kadar
		 * List(interface) olustururken constructor olarak Arraylist() seciyorduk.
		 */

		List<String> liste = new ArrayList<>();
		
		liste.add("X");
		liste.add("Y");

		LinkedList<String> ll1 = new LinkedList<>(); // LinkedList bir class oldugundan hata vermedi burda bize ve obje
														// uretmemize izin verdi.
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);
		ll1.add(1, "C");
		System.out.println(ll1);
		ll1.addAll(liste);    // liste listinin hepsini eklemis oldu.
		System.out.println(ll1);
		ll1.addAll(2, liste);
		System.out.println(ll1); // burada da 2. index'e listeyi yerlestırdı.
		ll1.addLast("K");
		System.out.println(ll1 ); // sona K ekledik 
		
		//LinkedList List ve Queue interface'lerine implement ile child oldugundan 
		// her iki interface'deki tum method'ları override tmek zorundadır.
		// islev olarak aynı isi yapan addLast() Queue interface'inden geliyor ve add() ise list interface'inden inherit edilmiştir.
		
		// ben bir linkedList olusturmak istiyorum ama sadece list ozelliklerini tasısın
		List<String> listList= new LinkedList<>();
		listList.add("Sadece List'den gelen ozellıkler var ");
		
		// ben bir linkedList olusturmak istiyorum ama sadece Queue ozelliklerini tasısın
		
		Queue<String> listQueue= new LinkedList<>();  // burada Queue interface'inden cagırdık özellikleri
		listQueue.add("Sadece queue'den gelen ozellikler var");
		

	}

}
