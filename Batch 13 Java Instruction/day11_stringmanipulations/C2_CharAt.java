package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		
		// charAt(index) 
		// scan�next().charAt(0)
		// index 0'dan ba�lar 
		String str = "Java cok guzel";
		System.out.println(str.charAt(0)); //J verir.
		
		System.out.println(str.charAt(5)); // c
		
		System.out.println(str.charAt(14));// l
		//kelimenin uzunlugu son index + 1 dir
		// son index kelimenin uzunlugu(length) -1
		
		// System.out.println(str.charAt(15)); // exception verir
		//eger index olarak Stringin uznlugu veya daha buyuk bir
		//say� girilirse
		
		//kullan�c� 10 harfli bir kelime girerse 
		//bana son harfi vericek kodu yaz�n�z
		//str.charAt(9)
		
//  String str3 = 5 ; 
		//Compile Time Error CTE
	    //kod cal�smaadan JAVA n�n fark�na var�p alt�n� k�rm�z� c�zd�g� hatad�r
		//Derleme zaman hatas� 
		//bu tur hatalar duzelt�lmeden java kodu cal�st�rmaz
		
		//System.out.println(str.charAt(14)); //baz� hatalar syntax den anlas�lmaz
		//	buna Run Time error  RTE den�r.
        
		
	}

}
