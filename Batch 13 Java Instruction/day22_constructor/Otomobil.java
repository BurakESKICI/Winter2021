package day22_constructor;

public class Otomobil {

	public Otomobil(String renk) { // istersek constructor'i parametreli olarak olusturab�l�r�z

	}

	// biz bir constructor olusturdugumuzda java default olan� yok eder.
	// dolay�s�yla biz bir constructor olusturdugumuzda mutlaka default
	// constructor'un yer�ne de bir constructor yazmal�y�z
	public Otomobil() { // default constructor'un yerine bunu yazmal�y�z.

	}
	// �NEML� NOT : Default constructor 'Dan baska bir constructor yazd�g�m�zda
	// java default olan� yok ett�g� �c�n MUTLAKA biz default yerine de constructor
	// yazmal�y�z
	

	String marka;
	String model;
	int y�l;
	boolean kazasiVarMi;

	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}

	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
	}

}
