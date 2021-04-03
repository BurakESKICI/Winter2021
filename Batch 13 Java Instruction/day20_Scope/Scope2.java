package day20_Scope;

public class Scope2 {

	public static void main(String[] args) {
		
		// ben farkli classlardan da scope1 class'ýna object olusturarak ulasabilirim
		
		Scope1 obj4 = new Scope1();
		System.out.println(obj4.isim);
		System.out.println(obj4.soyisim);
		obj4.isim="Ahmet";
		obj4.soyisim="Can";

		System.out.println(obj4.isim+" "+ obj4.soyisim );
		
	}

}
