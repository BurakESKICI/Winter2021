package day47_queue_maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue01 {

	public static void main(String[] args) {

		// Queue bir interface'dir dolayisiyla obje uretemeyiz!!!
		// Child class'i olan Priority

		Queue<String> k1 = new PriorityQueue<>();

		k1.add("D");
		k1.add("C");
		k1.add("M");
		k1.add("A");

		System.out.println(k1); // [A, M, C]
		// Queue (kuyruk) yap�s� geregi insertion order'a g�re yapmasi beklenir
		// Ancak constructor olarak PriorityQueue sectigimiz icin Java tarafindan
		// belirlenen
		// priority'e g�re siralama yapar.(rastgele yap�yor)

		// Biz de istersek priority kuralini tanimlayabiliriz.. O zaman bizim istegimize
		// gore siralar

		Queue<String> k2 = new LinkedList<>();
		// ayni elemanlarla fakat LinkedList consturctor'i kullanrak olusturdugumuz
		// Queue ise beklenenlere uygun olarak ekleme sirasina g�re yazdirir.

		k2.add("D");
		k2.add("C");
		k2.add("M");
		k2.add("A");

		System.out.println(k2); // [D, C, M, A]

		// Queue'nun yap�s� gereg� FIFO kural� gecerl�d�r.

		k2.offer("Z"); // en sona eleman ekliyor(priority'li obje hari� :D)
		System.out.println(k2);// [D, C, M, A, Z]
		k1.offer("Z");
		k1.offer("L");
		System.out.println(k1); // [A, C, L, D, Z, M] ==> yine kafas�na g�re ekledi.
		k2.peek();
		System.out.println(k2); // [D, C, M, A, Z] ama bize bilgi veriyor olabilir bakal�m
		System.out.println(k2.peek()); // D demek ki bu method bize ilk eleman� d�nd�r�yor.

		k2.remove();
		System.out.println(k2);// [C, M, A, Z] burada D yi sildi
		k2.remove();
		System.out.println(k2);// [M, A, Z] burada C yi sildi yani s�ralama olarak ilk'den basl�yor queue'de :D
		System.out.println(k2.remove()); // true
		System.out.println(k2);// [A, Z]
		k2.poll();
		System.out.println(k2.poll());
	    System.out.println("--------");
		System.out.println(k2); // [Z]
		// poll() method'u ilk elemani siler

	//	k2.remove(); // bu saty�rda son eleman olan Z silindi. eleman kalmad� excepiton verdi
		
		System.out.println(k2.isEmpty());// true

		k2.poll();// bo bir queue 'de remove() ile eleman silmek isterrsek eger exception verir
					// silecek bir sey kalmad�g� i�in hata veirr
		
		// ama k�sa bir NOT!!! eleman kalmad�g� halde remove'da exception veririrken poll()  method'unda vermiyor
		// poll() eleman bulup silemedigi i�in null d�nd�r�r.
		
		k2.offer("A");
		k2.offer("B");
		k2.offer("C");
		System.out.println(k2.element());// hi� element kalmad�ysa eger element() method'u exception veriyor 
		

	}

}
