package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {

		// kar�s�k s�ral� verilen bir array'i s�ral� olarak yazd�r�n

		int arr[] = { 25, 17, 6, 78, 45, 69, 1 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// ayni array'i kullanrak buyukten kucuge yazd�rabilirmiyiz ?

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + ",");

		}

		int arrTers[] = new int[arr.length]; // burada ilk arrayin uzunluguna es�t baska b�r array olusturdum
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]= arr[arr.length-1-i];
			
		}
		System.out.println(Arrays.toString(arrTers));

	}

}
