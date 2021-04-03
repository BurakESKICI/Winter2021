package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {

		int sayi = 10;
		int sayi2 = 20;
		int sayi3 = 30;
		String isim = "Ali";

		// Java'da birden fazla elemaný koyabilecegimiz (stroe) object'ler vardir.
		// bugun bunlardan ilkini öðrenecegiz

		int arr[] = { 10, 20, 30, }; // int [] arr þeklinde de kullanýlýr
										// bu örnekte array'in elemanlarýný direk yazdýgýmý ýcýn uzunluk belirtmeye
										// ihtiyaç kalmadý
										// bu kullanýmda max eleman sayýsý (length) yazdýgýnýz eleman sayýsýdýr.
										// array bir objedir
		System.out.println(arr); // eger direk olarak Array'i yazdýrmak isterseniz Java refereansý yazdýrýr.

		System.out.println(Arrays.toString(arr)); // 10 , 20, 30 yazar

		String takim[] = new String[3]; // [ null ,null, null ]
		System.out.println(Arrays.toString(takim));

		takim[0] = "Ali"; // 0'ýncý indexi ali yapmýþ olduk
		System.out.println(Arrays.toString(takim));
		takim[1] = "Hasan";
		takim[2] = "Veli";
		System.out.println(Arrays.toString(takim));

		// takim[3]="Mehmet"; // Java Run Time programdir, dolayýsýyla array programý
		// calýstýrýnca
		// olusturulur. 37 satýrda syntax olarak hata olmadaýgýndan CTE olmaz.
		// program calýstýgýnda 3. index olmadýgý için RTE verir.

		// Array'deki bir elemaný update etme
		// veli'nin yerine kemal gelsin

		takim[2] = "Kemal"; // veliyi kemal yaptýk

		// bir Array'in uzunlugunu nasýl bulabýlýrýz
		System.out.println(takim.length);
		// String den farký length koydugumda () parantez koymuyorum

		// Array'deki son elemaný Mehmet yapýn
		takim[takim.length-1]="Mehmet";
		System.out.println(Arrays.toString(takim));
		
		// eger array'i eleman sayýsý tek ise ortadaki elemani Can yapalým 
		
		if (takim.length %2 ==1) {
            int ortaIndex= (takim.length-1)/2;
            takim[ortaIndex]="Can";
        }
        
        System.out.println(Arrays.toString(takim));


	}

}
