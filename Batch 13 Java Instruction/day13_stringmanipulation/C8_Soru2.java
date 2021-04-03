package day13_stringmanipulation;

public class C8_Soru2 {

	public static void main(String[] args) {
		
		/*
		 *String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
			String str1 = �$13.99�
			String str2 = �$10.55�
			ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
		 */
		
		String str1 = "$13.99";
		str1=str1.replaceAll("\\D", "");
		System.out.println(str1);
		
		String str2 = "$10,55";
		str2=str2.replaceAll("\\D", "");
		System.out.println(str2);
		
		//str1 ve str2 icerigi sayi olan Stringlerdir
		// eger icerigini tamamen sayi oldugunu bildigimiz String varsa 
		//parseDouble() veya parseInteger() methodu kullanabilirz.
		//ancak primitive data tipleri method'a sahip olmad�klar�ndan wrapper class kullanmam laz�m
		
		double sayi1=Double.parseDouble(str1); //String olan bir degeri double'a cevirdik
		double sayi2=Double.parseDouble(str2);
		
		double toplam=(sayi1+sayi2)/100 ;
		
		System.out.println(toplam);
		
		
		
		
		
	}

}