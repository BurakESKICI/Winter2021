package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// kullanýcýdan degerler alarak int bir array  olusturunuz
		//once kullanýcýdan girecegi sayi adedini almamýz lazým ki array'i olusturalým 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen kac sayýdan olusan bir array istediginiz yazýnýz");
		
		int uzunluk=scan.nextInt();
		
		int arr[]= new int[uzunluk]; // 5 
		
		System.out.println("lutfen sayýlarý giriniz");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
