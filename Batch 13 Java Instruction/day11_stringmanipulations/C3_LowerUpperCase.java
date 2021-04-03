package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		
		// str.toLowerCase() cerilen String'in tamamýný kucukl harfe cevirir.
		//str.toUpperCase() cerilen String'in tamamýný buyuk harfe cevirir.
		
		String str = "Techproeducation";
		
		//buyuk harf ile yazdýrmak ýstersek 

		System.out.println(str.toUpperCase());
		
		//str'i buyuk cevýrmek ýstersek
		
		str=str.toUpperCase(); //bu satýrdan sonra kalýcý olarak str BUYUK harfler den olusan bir String oldu 
		
		System.out.println(str);
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
		
		
		
	}

}
