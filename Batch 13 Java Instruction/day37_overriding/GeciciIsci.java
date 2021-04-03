package day37_overriding;

public class GeciciIsci extends Isci {

	public String calýstýgýBolum = "Yemekhane";

	public static void main(String[] args) {

		// Overriding
		// bir child clas'da parent class'dan miras alinan method'u
		// degistirmeye overridining denir

		GeciciIsci gi1 = new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai(); //

	}

	// overriding yapmak icin parent class'daki method signature'i ile child
	// class'da bir method olusturulur.
	// signature ayný oldugundan sadece body degýsýr.
	// boylece parent class'daki method child class icin gecersiz hale gelir.

	public int maasHesapla() {
		

		return 32 * 8 * 10;
	}

	@Override // annotation
	public void mesai() {

		// super.mesai();
		System.out.println("Gecici iþciler hafta'da 25 saat calýsýr");

	}

	// annotation : dipnot anlamýna gelir ,
	// Java 28. satýrda kodu inceleyenler icin bir acýklama getiriyor

	// annotation olmasý ile olmamasý arasýndaki fark
	// annotation sadece bir açýklama degildir override yaptýgýmýz method'u surekli
	// kontrol eder ve parent class'daki overridden method signature'i
	// degýstýrýlýrse CTE verdirir

	// eger overide edilen parent class'daki method'un (overiden class( yani
	// geçersiz kýlýna ))calýsmasýný istiyorsak overidin method'un ilk satýrýna
	// super() overidenMethodIsmi yazarýz
	// eger method overiding method'da super. yazýlmassa overriden
	// method calýsmaz.

	// Acces modifier
	// Child Parent'i sýnýrlandýramaz
	// yani overriding method'un acces modifier'i overriden method'un access
	// modifier'indan daha dar olamaz.

	// public>protected>default>private

	// Return Type
	// overridden method'un return type'ý primitive veya void ise overriding
	// method'un return type'ý da ayný olmalý.
	// eger return type primitve degilse o zaman 
	//(overridding method'un return type'i ) IS-A (overridden method'un return type'i) olmalýdýr.

}
