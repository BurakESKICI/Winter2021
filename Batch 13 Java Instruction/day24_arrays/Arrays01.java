package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {

		int sayi = 10;
		int sayi2 = 20;
		int sayi3 = 30;
		String isim = "Ali";

		// Java'da birden fazla eleman� koyabilecegimiz (stroe) object'ler vardir.
		// bugun bunlardan ilkini ��renecegiz

		int arr[] = { 10, 20, 30, }; // int [] arr �eklinde de kullan�l�r
										// bu �rnekte array'in elemanlar�n� direk yazd�g�m� �c�n uzunluk belirtmeye
										// ihtiya� kalmad�
										// bu kullan�mda max eleman say�s� (length) yazd�g�n�z eleman say�s�d�r.
										// array bir objedir
		System.out.println(arr); // eger direk olarak Array'i yazd�rmak isterseniz Java refereans� yazd�r�r.

		System.out.println(Arrays.toString(arr)); // 10 , 20, 30 yazar

		String takim[] = new String[3]; // [ null ,null, null ]
		System.out.println(Arrays.toString(takim));

		takim[0] = "Ali"; // 0'�nc� indexi ali yapm�� olduk
		System.out.println(Arrays.toString(takim));
		takim[1] = "Hasan";
		takim[2] = "Veli";
		System.out.println(Arrays.toString(takim));

		// takim[3]="Mehmet"; // Java Run Time programdir, dolay�s�yla array program�
		// cal�st�r�nca
		// olusturulur. 37 sat�rda syntax olarak hata olmada�g�ndan CTE olmaz.
		// program cal�st�g�nda 3. index olmad�g� i�in RTE verir.

		// Array'deki bir eleman� update etme
		// veli'nin yerine kemal gelsin

		takim[2] = "Kemal"; // veliyi kemal yapt�k

		// bir Array'in uzunlugunu nas�l bulab�l�r�z
		System.out.println(takim.length);
		// String den fark� length koydugumda () parantez koymuyorum

		// Array'deki son eleman� Mehmet yap�n
		takim[takim.length-1]="Mehmet";
		System.out.println(Arrays.toString(takim));
		
		// eger array'i eleman say�s� tek ise ortadaki elemani Can yapal�m 
		
		if (takim.length %2 ==1) {
            int ortaIndex= (takim.length-1)/2;
            takim[ortaIndex]="Can";
        }
        
        System.out.println(Arrays.toString(takim));


	}

}
