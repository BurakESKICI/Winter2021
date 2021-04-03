package day13_stringmanipulation;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		
		//

		String str = "Java ogren, mutlu ol,Java candir 123456789";
		
		System.out.println(str.replace("Java", "hava"));
		
		//replaceAll() methodu replace() methoduna benzer ama 2 fark� vard�r.
		//1- replace() methodu char kabul eder ama replaceAll() methodu kabul etmez.
		//2- replaceAll() methodu regexp kullan�lmas�na izin verir.
		
		System.out.println(str.replaceAll("\\w", "*"));// t�m harf ve rakamlar yerine y�ld� yaz�cakt�r
		System.out.println(str.replaceAll("\\W", "*"));// w'nun tersi
		System.out.println(str.replaceAll("\\d", "."));// say�lar� . yapapr 
		System.out.println(str.replaceAll("\\D", "."));//say� olmayanlr� . yapar
		System.out.println(str.replaceAll("\\s", "&"));// bosluklar� & yapar
		System.out.println(str.replaceAll("\\S", "&"));//bosluk olmayan hersey� & yapar
		
		
	}

}
