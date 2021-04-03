package day41_errrors_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector {
	
	

	public static void main(String[] args) {
		
		String str="";
		for (int i = 0; i < 1000; i++) {
			str+=i;
		}
		
		/* bu kod çalýþtýgýnda kac tane obje olusur ?
		 * 1001
		 * ilk basta 1 tane olusturduk 
		 * sonra her dongude str'a concatenation yapýlcaka
		 * ama String class'i immutable oldugu için her yeni degeri koymak için 
		 * yeni bir String objesi olsuturulur ve eski objeden pointer silinir
		 * 
		 * dolayýsýyla loop bittiginde str için 1 tane pointer'ýn iþaret ettiði obje,
		 * 1000 tane de hic bir pointerin iþaret etmediði obje heap memory'de bulunur.
		 */
		
		List<Integer> list=new ArrayList<>();
		// bu satir java'ya yani bir obje olusturmasýný soyluyor.
		// Java yeni obje için yer varmý diye memory'i kontrol eder ve memory kritik seviyede ise 
		//Garbage Colector'U devreye sokar.
		
		/*Garbage collector finalize() methodunu çalýþtýrýr.
		  finalize method'u silinecek objeleri isaretler ve
		  sonra Garbage Collector fýnalized olan objeleri siler.
		  finalized olmayanlarý da sýkýstýrabildiði kadar sýkýstýrýr ve yer açar.
		  
		 */
		
		

	}
	
	

}
