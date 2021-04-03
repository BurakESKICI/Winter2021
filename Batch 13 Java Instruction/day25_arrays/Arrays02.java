package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {

		/*
		 * verilen bir array'de bir eleman�n var olup olmad���n� nas�l kontrol ederiz ?
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
			System.out.println("array sorulan eleman� i�eriyor");
		} else {
			System.out.println("array sorulan eleman� i�ermiyor");
		}

		// Arrays class'inda method kullanarak yapal�m

		// ilk �nce s�ralama yapmal�y�z
		Arrays.sort(arr);// ilk �nce s�ralama yapmal�y�z ( yani 3 ,10,16,25,75 )
		System.out.println(Arrays.binarySearch(arr, 25));// sonuc olarak aranan sayinin index'ini verir yani 25 in
															// inedxi 3 t�r

		// NOT: binary searh sonuc olarak arad�g�m�z eleman varsa indexini verir e�er
		// arad�g�m�z eleman yoksa - i�areti ile olsayd� kac�nc� eleman olacag�n�
		// d�nd�r�rd�.
		
		int arr2[]= { 12,15,25,14,3,12,65};
		
		Arrays.sort(arr2);// burada kucukten buyuge s�ralad� 
		System.out.println(Arrays.binarySearch(arr2,20)); // -6 degeri olarak ortalama yerini verdi 
		
		String arrayString =Arrays.toString(arr2);
		System.out.println(arrayString);
		System.out.println(arrayString.substring(5));

	}

}
