package day37_overriding;

public class GeciciIsci extends Isci {

	public String cal�st�g�Bolum = "Yemekhane";

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
	// signature ayn� oldugundan sadece body deg�s�r.
	// boylece parent class'daki method child class icin gecersiz hale gelir.

	public int maasHesapla() {
		

		return 32 * 8 * 10;
	}

	@Override // annotation
	public void mesai() {

		// super.mesai();
		System.out.println("Gecici i�ciler hafta'da 25 saat cal�s�r");

	}

	// annotation : dipnot anlam�na gelir ,
	// Java 28. sat�rda kodu inceleyenler icin bir ac�klama getiriyor

	// annotation olmas� ile olmamas� aras�ndaki fark
	// annotation sadece bir a��klama degildir override yapt�g�m�z method'u surekli
	// kontrol eder ve parent class'daki overridden method signature'i
	// deg�st�r�l�rse CTE verdirir

	// eger overide edilen parent class'daki method'un (overiden class( yani
	// ge�ersiz k�l�na ))cal�smas�n� istiyorsak overidin method'un ilk sat�r�na
	// super() overidenMethodIsmi yazar�z
	// eger method overiding method'da super. yaz�lmassa overriden
	// method cal�smaz.

	// Acces modifier
	// Child Parent'i s�n�rland�ramaz
	// yani overriding method'un acces modifier'i overriden method'un access
	// modifier'indan daha dar olamaz.

	// public>protected>default>private

	// Return Type
	// overridden method'un return type'� primitive veya void ise overriding
	// method'un return type'� da ayn� olmal�.
	// eger return type primitve degilse o zaman 
	//(overridding method'un return type'i ) IS-A (overridden method'un return type'i) olmal�d�r.

}
