package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {

		/*
		 * verilen bir array'de bir elemanýn var olup olmadýðýný nasýl kontrol ederiz ?
		 */

		int arr[] = { 10, 25, 3, 16, 75 };

		int sayi = 25;

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sayi) {
				flag = true;
			}
		}

		if (flag) {
			System.out.println("array sorulan elemaný içeriyor");
		} else {
			System.out.println("array sorulan elemaný içermiyor");
		}

		// Arrays class'inda method kullanarak yapalým

		// ilk önce sýralama yapmalýyýz
		Arrays.sort(arr);// ilk önce sýralama yapmalýyýz ( yani 3 ,10,16,25,75 )
		System.out.println(Arrays.binarySearch(arr, 25));// sonuc olarak aranan sayinin index'ini verir yani 25 in
															// inedxi 3 tür

		// NOT: binary searh sonuc olarak aradýgýmýz eleman varsa indexini verir eðer
		// aradýgýmýz eleman yoksa - iþareti ile olsaydý kacýncý eleman olacagýný
		// döndürürdü.
		
		int arr2[]= { 12,15,25,14,3,12,65};
		
		Arrays.sort(arr2);// burada kucukten buyuge sýraladý 
		System.out.println(Arrays.binarySearch(arr2,20)); // -6 degeri olarak ortalama yerini verdi 
		
		String arrayString =Arrays.toString(arr2);
		System.out.println(arrayString);
		System.out.println(arrayString.substring(5));

	}

}
