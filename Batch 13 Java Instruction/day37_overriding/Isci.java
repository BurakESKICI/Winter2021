package day37_overriding;

public class Isci extends Personel {

	public String bolum = "Kaynak Atolyesi";
	public int maas = 5000;
	public String isim="Mesut";
	
	
	

	public int maasHesapla() {
		return 30 * 8 * 15; // 30 gün sayýsý 8 günlük mesai 15 saat ücreti

	}

	public void mesai( ) {
		System.out.println("isciler gunluk 8 saat calýsýr");

	}
	
	
	
	

	// Overloading ile Overriding karýstýrýlýyor dýkkat edelim !
	// Overloading : ayný isimde ama farklý method signature 'lere( paramtre ) sahip
	// methodlar
	public int maasHesapla(int gunSayisi) { // 1 tane data tipi eklemiþ olduk ve diðer default olan method'dan farklý
											// olmus oldu iþlem ayný olsa'da

		return gunSayisi * 8 * 15;
	}

	public int maasHesapla(int gunlukCalismaSaati, int gunSayisi) { // þimdi iki farklý data türü olan bir parametre
																	// olmus oldu fakat yaptýgý iþlemler ayný 

		return gunSayisi * gunlukCalismaSaati * 15;
	}

	public int maasHesapla(int gunlukCalismaSaati, int gunSayisi, int saatUcreti) {// method isimleri ayný iþlemler ayný
																					// ama 3. bir data type ekledik bu
																					// yüzden farklý oldu ve kabul etti

		return gunSayisi * gunlukCalismaSaati * saatUcreti;
	}
	
	

}
