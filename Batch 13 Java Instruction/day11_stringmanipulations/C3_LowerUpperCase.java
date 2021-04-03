package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		
		// str.toLowerCase() cerilen String'in tamam�n� kucukl harfe cevirir.
		//str.toUpperCase() cerilen String'in tamam�n� buyuk harfe cevirir.
		
		String str = "Techproeducation";
		
		//buyuk harf ile yazd�rmak �stersek 

		System.out.println(str.toUpperCase());
		
		//str'i buyuk cev�rmek �stersek
		
		str=str.toUpperCase(); //bu sat�rdan sonra kal�c� olarak str BUYUK harfler den olusan bir String oldu 
		
		System.out.println(str);
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
		
		
		
	}

}
