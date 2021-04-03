package day12_stringmanupalation;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		
		// 
		
		String str1 = "Ali Can";
		String str2 = str1 + "" ; //Ali Can
		
		System.out.println(str1==str2);// False
		
		//Stringlerin hem degerlerine hem de adreslerine bakar
		//bu ornekte str1+"" yazdýgýmýzda concatination yapýldýgý ýcýn Java yeni bir bir obje
		//olusturur ve iþlemin sonucunu yeni objenin icine koyar
		//str1 ve str2'yi == ile karsýlastýrýrsak degerleri ayný fakat adresleri farklý oldugu ýcýn 
		//False doner
		
		System.out.println(str1.equals(str2)); //true
		
		//equals() merhodu sadece String'lerin degerlerýný karsýlastýrýr
		//bu ornekte srt1 ile str2 nin degerleri AYNI oldugu ýcýn true doner
		
		String str3="Ali Can";
		System.out.println(str3==str1); // true
		System.out.println(str1.equals(str3)); //true
		

	}

}
