package day42_abstractclasses;

public class C1_final {

	final static int SAY� = 10;
	// instance bir variable 'i final ve static yaparsan�z java onu bold yapar
	// bizde o variableyi b�y�k harfle yazar�z (istege kalm�s ama )

	String isim;
	// instance variable'lara ilk deger atamas� yapmak zorunda deg�l�z
	// deger atamada�g�m�zda Java data turune gore default bir deger atar.

	 // final String soyisim;
	// final variable 'lar�n degeri sonradan deg�st�r�lemeyeceg� �c�n �lk atama
	// yap�lamdan olusturumas�na ,Java izin vermez.

	public static void main(String[] args) {

		System.out.println(SAY�);
	}
	
	
	public void deneme() {
		
		System.out.println("denem yap�yoruz");
		
	}
	
	public final void deneme2() {
		
	}

}
