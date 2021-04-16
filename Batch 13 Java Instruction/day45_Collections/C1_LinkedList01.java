package day45_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		// linked bagli demektir
		// linked list'te tum elemanlar birbirine tren gibi bagl�d�r.

		// her linked list bir "head" ile ba�lar "head" i�erisinde sadece adrres vard�r
		// bundan
		// sonraki her bir eleman bir "adres parcac�g�" ve birde "deger" olusturur bu
		// k�smada
		// node denir.
		// Ve son vagonda adres olarak null g�sterir arkas�nda g�sterecegi vagon
		// kalmad�g� icin
		// ve ben bir vagonu c�kard�g�mda bir arkas�ndaki vagonun adresi gelir basitce
		// tren mant�g� hepsi.
		// ama s�yle bir gercek var biz yazd�rd�g�m�zda ekranda adres degil tabikide
		// valuue(deger) c�k�cakt�r
		// o adres'ler javan�n arka plandaki calisma mant�g� olarak anlatt�k.

		// *B*// KISA BIR NOT: Interface'lerde obje olusturam�yoruz abstract'larda da
		// hat�rlarsak Listg<String> liste= new ArrayList<>(); yap�yorduk yani list
		// interface oldugu i�in biz onun constructorunu bir class'a at�yorduk ve obje
		// olusturab�l�yorduk.

		// *M*
		/*
		 * Collection'da obje olustururken olsuturmak istedigimiz collection'in class mi
		 * yoksa inteface'mi olduguna bakmal�y�z data turu olarak o interface'i
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
		System.out.println(ll1); // burada da 2. index'e listeyi yerlest�rd�.
		ll1.addLast("K");
		System.out.println(ll1 ); // sona K ekledik 
		
		//LinkedList List ve Queue interface'lerine implement ile child oldugundan 
		// her iki interface'deki tum method'lar� override tmek zorundad�r.
		// islev olarak ayn� isi yapan addLast() Queue interface'inden geliyor ve add() ise list interface'inden inherit edilmi�tir.
		
		// ben bir linkedList olusturmak istiyorum ama sadece list ozelliklerini tas�s�n
		List<String> listList= new LinkedList<>();
		listList.add("Sadece List'den gelen ozell�kler var ");
		
		// ben bir linkedList olusturmak istiyorum ama sadece Queue ozelliklerini tas�s�n
		
		Queue<String> listQueue= new LinkedList<>();  // burada Queue interface'inden cag�rd�k �zellikleri
		listQueue.add("Sadece queue'den gelen ozellikler var");
		

	}

}
