package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		
		// charAt(index) 
		// scançnext().charAt(0)
		// index 0'dan baþlar 
		String str = "Java cok guzel";
		System.out.println(str.charAt(0)); //J verir.
		
		System.out.println(str.charAt(5)); // c
		
		System.out.println(str.charAt(14));// l
		//kelimenin uzunlugu son index + 1 dir
		// son index kelimenin uzunlugu(length) -1
		
		// System.out.println(str.charAt(15)); // exception verir
		//eger index olarak Stringin uznlugu veya daha buyuk bir
		//sayý girilirse
		
		//kullanýcý 10 harfli bir kelime girerse 
		//bana son harfi vericek kodu yazýnýz
		//str.charAt(9)
		
//  String str3 = 5 ; 
		//Compile Time Error CTE
	    //kod calýsmaadan JAVA nýn farkýna varýp altýný kýrmýzý cýzdýgý hatadýr
		//Derleme zaman hatasý 
		//bu tur hatalar duzeltýlmeden java kodu calýstýrmaz
		
		//System.out.println(str.charAt(14)); //bazý hatalar syntax den anlasýlmaz
		//	buna Run Time error  RTE denýr.
        
		
	}

}
