package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		
		String isim="Ali";
		isim.concat("Can");
		System.out.println(isim); // Ali
		
		System.out.println(isim.concat("Can")); // AliCan
		System.out.println(isim);// Ali
		
		//Strin'lerde method ile yaptýgýmýz degisikler kalici OLMAZ
		//cunku Java String Class'ini IMMUTABLE yapmýþtýr.
		
		List<String> isimList= new ArrayList<>();
		System.out.println(isimList);
		isimList.add("Ali");
		isimList.add("Can");
		System.out.println(isimList);
		isimList.remove(1);
		System.out.println(isimList);
		
		//list'lerde method'la yaptýgýmýz degýsýklýkler kalýcý olarak list'e islenir.
		//cunku list MUTABLE'dir.
		
		

	}

}
