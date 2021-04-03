package day28_foreachloop;

public class C1_ForeachLoop01 {

	public static void main(String[] args) {
		// bir array'in tüm elemanlarýný for loop ile yazdýralým

		int arr[] = { 2, 4, 6, 8, 10, 12 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

//		for loop yazmamýzýn amacý array'in TÜM ELEMANLARI üzerinde iþlem yapmak ise
//		foreach Loop daha kolay kod yazmamýzý saðlar

//		each==> her bir demek 
//		foreach Loop istedigim bir topluluktaki tüm elemanlarý birer birer bana getirir
//		foreach loop 'ta baþlangýc degeri YOKTUR, bitiþ degeri YOKTUR, ayný zamanda ÝNDEX'DE YOKTUR.

		System.out.println();
		
		for (int each : arr) {
			
			System.out.print(each + " ");
		}
		
		
		
		
		
	}

}
