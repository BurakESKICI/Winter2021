package day22_constructor;

public class Otomobil {

	public Otomobil(String renk) { // istersek constructor'i parametreli olarak olusturabýlýrýz

	}

	// biz bir constructor olusturdugumuzda java default olaný yok eder.
	// dolayýsýyla biz bir constructor olusturdugumuzda mutlaka default
	// constructor'un yerýne de bir constructor yazmalýyýz
	public Otomobil() { // default constructor'un yerine bunu yazmalýyýz.

	}
	// ÖNEMLÝ NOT : Default constructor 'Dan baska bir constructor yazdýgýmýzda
	// java default olaný yok ettýgý ýcýn MUTLAKA biz default yerine de constructor
	// yazmalýyýz
	

	String marka;
	String model;
	int yýl;
	boolean kazasiVarMi;

	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}

	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
	}

}
