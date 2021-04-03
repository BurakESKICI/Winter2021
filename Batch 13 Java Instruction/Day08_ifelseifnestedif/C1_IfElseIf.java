package Day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		
		
		/*
		 * kullanýcýdan gün ismini yazmasýný isteyin 
		 * girilen isim geçerli bir gün ise gün ismini
		 * 1.,2.ve 3. harflerini ilk harf büyük diðer ikisi küçük olarak yazdýrýn
		 * gün ismi geçerli deðilse" geçerli gün ismini giriniz" yazdýrýn
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen gün ismini giriniz");

		String gunIsmý = scan.nextLine().toLowerCase(); // girilen tüm yazýyý kucuk harfe cevýrdýk
		
		// next() : sadece ilk kelimeyi alur spaceye kadar olan ilk kelimeyi
		//nextLine () : bu kod ise birden çok kelimeyi almaya yarar
		
		
		if (gunIsmý.equalsIgnoreCase("pazar") || gunIsmý.equalsIgnoreCase("pazartesi")) {
			
			System.out.println("Paz");
		}
		else if (gunIsmý.equalsIgnoreCase("cuma") || gunIsmý.equalsIgnoreCase("cumartesi") ) {
			System.out.println("Cum");
		}
		else if (gunIsmý.equalsIgnoreCase("Sali")) {
			System.out.println("Sal");
		}
		else if (gunIsmý.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");
		}
		else if (gunIsmý.contentEquals("persembe")) {
			System.out.println("Per");
		}
		else  System.out.println("Lutfen gecerli gun ismi giriniz");
		
		//equalsIgnoreCase() : methofu iki string'in buyuk,kucuk hark hassasiyeti olmadan 
		//eþit olup olmadýgýný kontrol eder.
		
		
		scan.close();
	}

}
