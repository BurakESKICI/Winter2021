package day24_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {

		/*
		 * Soru 2: Verilen bir array�in tum elemanlarini toplayan bir program yazalim.
		 */

		int arr[] = { 10, 15, 2, 45, 78 };

		int toplam = 0;

		for (int i = 0; i < arr.length; i++) {
			toplam += arr[i];
		}
		System.out.println(toplam);

		// verilen array'in t�m elemanlar�n� toString method olmadan yanyana ve
		// aralar�nda b�r bosluk yazd�r�n
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + ",");
			
		}
	}

}
