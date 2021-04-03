package day12_stringmanupalation;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// IndexOf() method'u bize istedigimiz karakter(lerin) index'ini döndürür.
		
		String str="Java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6)); // g
		
		System.out.println("char arama " + str.indexOf('g')); //6
		
		System.out.println("String arama " + str.indexOf("g")); //6
		
		System.out.println("String kelime arama " + str.indexOf("is")); //12
		
		System.out.println("birden fazla varsa "+str.indexOf('i'));// ilk buldugunu getýrýr
		
		System.out.println("baslangýc ýndexi ile " + str.indexOf('a', 4)); 
		// 4.karakterden sonraki al nerede
		// 4. karakter dahil
		
		System.out.println("olmayan harf" + str.indexOf("dert"));

		// kullanýcýdan býr cumle ýsteyýn 
		// case olmadan Java kelýmesý ýcerýp ýcermedýgnýý yazdýrýn
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("býr cumle yaz ");
		
		String str1=scan.nextLine().toLowerCase();
		
	  //  int sonuc=str1.indexOf("java");
	    
	  // System.out.println(sonuc>=0 ? "java içerir" : "java içermez");
	    
	    if (str1.indexOf("java")>=0) { //java kelimesinin indexini 0 veya daha buyuk oldugunu kontrol edýyor
	    	
			System.out.println("Cumle java iceriyor");
		} else {
            System.out.println("Cumle java icermiyor");
		}
		
	    
		scan.close();
	}

}
