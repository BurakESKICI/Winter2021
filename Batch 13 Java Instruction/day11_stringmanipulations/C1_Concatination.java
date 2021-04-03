package day11_stringmanipulations;

public class C1_Concatination {

	public static void main(String[] args) {
		
		//Concatenation : Java'da + i�lemi yap�l�rken eger toplanan ifadelerden biri 
		//veya her ikisi String ise Java toplama degil birle�tirme yapar
		
		System.out.println( 15 + 20 + "Merhaba "); // 35Merhaba yazd�r�r. 
		System.out.println("Merhaba" + 15 + 20); // Merhaba1520 yazd�r�r.
		System.out.println("Merhaba" + (15 + 20));// Merhaba35 yazd�r�r.
		System.out.println("Merhaba" + 15 * 20);// Merhaba300 yazd�r�r.
		
		
		String str1="Hello";
		String str2="World";
		//Hello World yazd�rmak istersek ;
		
		System.out.println(str1 +" "+ str2);
      
		System.out.println(str1.concat(str2));//Hello Wolrd
		System.out.println(str1.concat(" ").concat(str2));//Hello Wolrd
		System.out.println(str1.concat(" " + str2));// Hello World
	}

}
