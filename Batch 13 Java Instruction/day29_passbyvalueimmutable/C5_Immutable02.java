package day29_passbyvalueimmutable;

public class C5_Immutable02 {

	public static void main(String[] args) {
		
		//degisikligi kal�c� yapmak �c�n atama yaparsak 
		// immutable class'lar nas�l davran�r?
		
		String isim="Ali";
		
		isim=isim+"";
		
		System.out.println(isim.equals("Ali")); // true 
		System.out.println(isim=="Ali");  // false
		
		String str1= new String ("Mehmet");
		String str2= new String ("Mehmet");
		
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1==str2); // false      ��nk� referanslar� farkl� oldugu �c�n false verir.
		
		String str3= "Mehmet";
		String str4= "Mehmet";
		
		System.out.println(str3.equals(str4)); // true 
		System.out.println(str3==str4); // true
		
		

	}

}
