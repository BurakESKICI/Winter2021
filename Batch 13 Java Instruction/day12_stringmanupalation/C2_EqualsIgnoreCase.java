package day12_stringmanupalation;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		
		// equalsIgnoreCase() merhodu kars�last�r�ld�g� Stringlere case senstive 
		//(buyuk kucuk harf duyarl�l�g�) olmaks�z�n bakar.
		//Stringler ayn� �se true deg�lse false doner
		
		String str1 = "Ali Can";
		String str2 = "ali CAN";
		String str3 = "Ali can";
		
		
		System.out.println(str1.equals(str2)); //False
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
        System.out.println(str1.equals(str3)); //False
        System.out.println(str1.equalsIgnoreCase(str3));//true

	}

}
