package day41_errrors_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector {
	
	

	public static void main(String[] args) {
		
		String str="";
		for (int i = 0; i < 1000; i++) {
			str+=i;
		}
		
		/* bu kod �al��t�g�nda kac tane obje olusur ?
		 * 1001
		 * ilk basta 1 tane olusturduk 
		 * sonra her dongude str'a concatenation yap�lcaka
		 * ama String class'i immutable oldugu i�in her yeni degeri koymak i�in 
		 * yeni bir String objesi olsuturulur ve eski objeden pointer silinir
		 * 
		 * dolay�s�yla loop bittiginde str i�in 1 tane pointer'�n i�aret etti�i obje,
		 * 1000 tane de hic bir pointerin i�aret etmedi�i obje heap memory'de bulunur.
		 */
		
		List<Integer> list=new ArrayList<>();
		// bu satir java'ya yani bir obje olusturmas�n� soyluyor.
		// Java yeni obje i�in yer varm� diye memory'i kontrol eder ve memory kritik seviyede ise 
		//Garbage Colector'U devreye sokar.
		
		/*Garbage collector finalize() methodunu �al��t�r�r.
		  finalize method'u silinecek objeleri isaretler ve
		  sonra Garbage Collector f�nalized olan objeleri siler.
		  finalized olmayanlar� da s�k�st�rabildi�i kadar s�k�st�r�r ve yer a�ar.
		  
		 */
		
		

	}
	
	

}
