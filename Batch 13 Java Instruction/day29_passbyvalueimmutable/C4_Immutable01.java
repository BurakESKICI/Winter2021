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
		
		//Strin'lerde method ile yapt�g�m�z degisikler kalici OLMAZ
		//cunku Java String Class'ini IMMUTABLE yapm��t�r.
		
		List<String> isimList= new ArrayList<>();
		System.out.println(isimList);
		isimList.add("Ali");
		isimList.add("Can");
		System.out.println(isimList);
		isimList.remove(1);
		System.out.println(isimList);
		
		//list'lerde method'la yapt�g�m�z deg�s�kl�kler kal�c� olarak list'e islenir.
		//cunku list MUTABLE'dir.
		
		

	}

}
