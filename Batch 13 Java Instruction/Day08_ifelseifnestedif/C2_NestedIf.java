package Day08_ifelseifnestedif;

public class C2_NestedIf {

	public static void main(String[] args) {
		
		// Nested : iç içe demek
		/*
		 * verilen cinsiyet ve yas icin kisinin emekli olup olamayacagini
		 * yazdiran bir java pragrami yaziniz
		 * eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		 * calisan erkekse 65 yasindan buyukse emekli olabilir.
		 */

		String cinsiyet="Erkek";
		int yas= 47;
		
		if (yas<0) {
			System.out.println("Yas negatif olamaz");
		}
		
		else if (cinsiyet.equalsIgnoreCase("erkek") && yas >= 65) {
			System.out.println("Emekli olabilirsin");
		}
		else if (cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
			System.out.println("Emekli olamazsın");
		}
		else if (cinsiyet.equalsIgnoreCase("kadın") && yas>=60 )  {
			System.out.println("Emekli olabilirsin");
		}
		else if (cinsiyet.equalsIgnoreCase("kadın") && yas <60) {
			System.out.println("Emekli olamazsın");
		}
	    else System.out.println("Cinsiyet veya yas tanımsız");
		
		
		
		
		System.out.println("Nested if ile sonuc");
		
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			
			if (yas<0) {
				System.out.println("yas negatif olamaz");
			}else if (yas<65) {
				System.out.println("Emekli olamazsin");
			}else {
				System.out.println("Emekli olabilirsin");
			}
			
			
			
			
		}else if (cinsiyet.equalsIgnoreCase("kadin")) {
			
			if (yas<0) {
				System.out.println("Yas negatif olamaz");
			}else if (yas<60) {
				System.out.println("Emekli olamazsin");
			}else {
				System.out.println("Emekli olabilirsin");
			}
			
			
			
		
			
		}else  { System.out.println("yazdıiginiz cinsiyet sisteme dahil degil");
			
		}
		
		
		
		
		
		
	}

}
