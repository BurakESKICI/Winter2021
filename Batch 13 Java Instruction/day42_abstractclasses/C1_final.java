package day42_abstractclasses;

public class C1_final {

	final static int SAYÝ = 10;
	// instance bir variable 'i final ve static yaparsanýz java onu bold yapar
	// bizde o variableyi büyük harfle yazarýz (istege kalmýs ama )

	String isim;
	// instance variable'lara ilk deger atamasý yapmak zorunda degýlýz
	// deger atamadaýgýmýzda Java data turune gore default bir deger atar.

	 // final String soyisim;
	// final variable 'larýn degeri sonradan degýstýrýlemeyecegý ýcýn ýlk atama
	// yapýlamdan olusturumasýna ,Java izin vermez.

	public static void main(String[] args) {

		System.out.println(SAYÝ);
	}
	
	
	public void deneme() {
		
		System.out.println("denem yapýyoruz");
		
	}
	
	public final void deneme2() {
		
	}

}
