package day37_overriding;

public class Isci extends Personel {

	public String bolum = "Kaynak Atolyesi";
	public int maas = 5000;
	public String isim="Mesut";
	
	
	

	public int maasHesapla() {
		return 30 * 8 * 15; // 30 g�n say�s� 8 g�nl�k mesai 15 saat �creti

	}

	public void mesai( ) {
		System.out.println("isciler gunluk 8 saat cal�s�r");

	}
	
	
	
	

	// Overloading ile Overriding kar�st�r�l�yor d�kkat edelim !
	// Overloading : ayn� isimde ama farkl� method signature 'lere( paramtre ) sahip
	// methodlar
	public int maasHesapla(int gunSayisi) { // 1 tane data tipi eklemi� olduk ve di�er default olan method'dan farkl�
											// olmus oldu i�lem ayn� olsa'da

		return gunSayisi * 8 * 15;
	}

	public int maasHesapla(int gunlukCalismaSaati, int gunSayisi) { // �imdi iki farkl� data t�r� olan bir parametre
																	// olmus oldu fakat yapt�g� i�lemler ayn� 

		return gunSayisi * gunlukCalismaSaati * 15;
	}

	public int maasHesapla(int gunlukCalismaSaati, int gunSayisi, int saatUcreti) {// method isimleri ayn� i�lemler ayn�
																					// ama 3. bir data type ekledik bu
																					// y�zden farkl� oldu ve kabul etti

		return gunSayisi * gunlukCalismaSaati * saatUcreti;
	}
	
	

}
