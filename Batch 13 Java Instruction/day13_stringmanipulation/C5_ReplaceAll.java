package day13_stringmanipulation;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		
		//

		String str = "Java ogren, mutlu ol,Java candir 123456789";
		
		System.out.println(str.replace("Java", "hava"));
		
		//replaceAll() methodu replace() methoduna benzer ama 2 farký vardýr.
		//1- replace() methodu char kabul eder ama replaceAll() methodu kabul etmez.
		//2- replaceAll() methodu regexp kullanýlmasýna izin verir.
		
		System.out.println(str.replaceAll("\\w", "*"));// tüm harf ve rakamlar yerine yýldý yazýcaktýr
		System.out.println(str.replaceAll("\\W", "*"));// w'nun tersi
		System.out.println(str.replaceAll("\\d", "."));// sayýlarý . yapapr 
		System.out.println(str.replaceAll("\\D", "."));//sayý olmayanlrý . yapar
		System.out.println(str.replaceAll("\\s", "&"));// bosluklarý & yapar
		System.out.println(str.replaceAll("\\S", "&"));//bosluk olmayan herseyý & yapar
		
		
	}

}
