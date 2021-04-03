package day28_foreachloop;

public class C1_ForeachLoop01 {

	public static void main(String[] args) {
		// bir array'in t�m elemanlar�n� for loop ile yazd�ral�m

		int arr[] = { 2, 4, 6, 8, 10, 12 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

//		for loop yazmam�z�n amac� array'in T�M ELEMANLARI �zerinde i�lem yapmak ise
//		foreach Loop daha kolay kod yazmam�z� sa�lar

//		each==> her bir demek 
//		foreach Loop istedigim bir topluluktaki t�m elemanlar� birer birer bana getirir
//		foreach loop 'ta ba�lang�c degeri YOKTUR, biti� degeri YOKTUR, ayn� zamanda �NDEX'DE YOKTUR.

		System.out.println();
		
		for (int each : arr) {
			
			System.out.print(each + " ");
		}
		
		
		
		
		
	}

}
