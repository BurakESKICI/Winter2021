package day46_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C2_HashSet02 {

	public static void main(String[] args) {
		/*
		 * verilen bir Array'deki tekrarlý elemanlarý silip unique elemanlar'dan oluþan
		 * bir Array'e çeviren bir method yazýnýz.
		 */

		int arr[] = { 2, 3, 4, 3, 5, 3, 6, 4, 7, 4, 8, 5 };

		int tekrarsizArray[] = tekrarlariSil(arr);
		
		System.out.println("Main method içinde Array olarak :"+Arrays.toString(tekrarsizArray));

	}

	public static int[] tekrarlariSil(int[] arr) {

		Set<Integer> set1 = new HashSet<>();

		for (Integer each : arr) {

			set1.add(each);
		}

		System.out.println("Set olarak method içinde" +set1); // [2, 3, 4, 5, 6, 7, 8]

		int tekrarsizArray[] = new int[set1.size()]; // Set'in size'ini alip bu buyuklukte bir Array olusturduk.

		int index = 0; // Neden foreach loop kullandik ? Cunku Set'de index yok . Yani for'u kullanamam
						// cunku orada index gerekiyor
		for (int each : set1) {
			tekrarsizArray[index] = each; // burada ise kendisi tek tek aliyor. Set'deki elemanlari Array'e ekledik.
			index++; // Array index'e ihtiyac duydugu icin int index = 0; local variable'ini
						// olusturduk.
		}

		return tekrarsizArray;
	}

}
