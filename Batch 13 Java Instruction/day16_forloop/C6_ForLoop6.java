package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question Kullanicidan bir String
		// isteyin ve Stringi tersine ceviren bir program yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir String giriniz");

		String str = scan.nextLine();

		String tersyazi = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			tersyazi += str.charAt(i);

			scan.close();
		}
		System.out.println("girdiginiz yazinin tersi :" + tersyazi);

		// 2.yol

		System.out.print("girdiginiz yazinin tersi :");

		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));

		}

		System.out.println("");
		// 3. yol method olusturup bunu yazdýrabýlýrsýnýz

		tersineCevir(str);

	}

	public static void tersineCevir(String str) {
		// 
		
		System.out.print("girdiginiz yazinin tersi :");
for (int i = str.length()-1; i >= 0; i--) {
			
			System.out.print(str.charAt(i));
		
}

	}

}
