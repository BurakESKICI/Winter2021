package day11_stringmanipulations;

public class C1_Concatination {

	public static void main(String[] args) {
		
		//Concatenation : Java'da + iþlemi yapýlýrken eger toplanan ifadelerden biri 
		//veya her ikisi String ise Java toplama degil birleþtirme yapar
		
		System.out.println( 15 + 20 + "Merhaba "); // 35Merhaba yazdýrýr. 
		System.out.println("Merhaba" + 15 + 20); // Merhaba1520 yazdýrýr.
		System.out.println("Merhaba" + (15 + 20));// Merhaba35 yazdýrýr.
		System.out.println("Merhaba" + 15 * 20);// Merhaba300 yazdýrýr.
		
		
		String str1="Hello";
		String str2="World";
		//Hello World yazdýrmak istersek ;
		
		System.out.println(str1 +" "+ str2);
      
		System.out.println(str1.concat(str2));//Hello Wolrd
		System.out.println(str1.concat(" ").concat(str2));//Hello Wolrd
		System.out.println(str1.concat(" " + str2));// Hello World
	}

}
