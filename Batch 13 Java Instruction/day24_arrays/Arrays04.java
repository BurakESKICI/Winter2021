package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// kullan�c�dan degerler alarak int bir array  olusturunuz
		//once kullan�c�dan girecegi sayi adedini almam�z laz�m ki array'i olustural�m 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen kac say�dan olusan bir array istediginiz yaz�n�z");
		
		int uzunluk=scan.nextInt();
		
		int arr[]= new int[uzunluk]; // 5 
		
		System.out.println("lutfen say�lar� giriniz");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
