package day25_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// verilen bir String'i array'e nas�l �eviririz ?
		// verilen bir c�mlede ka� kelime oldu�unu bulunuz
		// verilen c�mlede her kelimenin ilk harfini b�y�k yap�n�z

		String str = "Herkes Javayi tan�sa severdi";
		// bu stringi kelimelere ay�ral�m
		// split methodu

		String arr[] = str.split(" ");

		System.out.println(Arrays.toString(arr));

		String arr2[] = str.split("Java");
		System.out.println(Arrays.toString(arr2));
		
		String arr3[]=str.split("a");
		System.out.println(Arrays.toString(arr3));
		
		String arr4[]=str.split("");
		System.out.println(Arrays.toString(arr4));
	}

}
