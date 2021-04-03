package day33_encapsulation;

public class Encapsulation02 {

	private String okulIsm� = "Y�ld�z koleji";
	// Okul isminin ba�ka class'lardan okunmas�n� ama deger atanamamas�n� istiyorsak
	// getter() method'u kullan�l�r ,olu�turulur

	private String tcNo = "12345678901";
	private int hesapNo = 5554321;
	public int sayi =1234;
	// obje olusturularak deger atan�p kullan�lmas�n� istedigimiz ama ilk atad�g�m�z
	// deger�n gorunmemesini istiyorsak setter() method'u kullan�l�r.

	public static void main(String[] args) {
		// eger ulasmak istedigim class uyeleri(clas member) public degilse baska
		// package'leden ulasmka �c�n extra i�lem gerekir.

		// Yapabilecegimiz i�lemlerden 1. si Encapsulation ( Data saklama)
		// bu Class'da kimseyle payla�mak istemedi�imiz variable ve method'lar
		// olustural�m

		// private yap�nca guvenlik konusunu halletmi� olduk ancak class �yelelerinin
		// private olmas� OOP concept'e ayk�r�

		// Encapsulation class'�m�zda olusturdugumuz class �yelerine kimlerin ne oranda
		// ula�abilece�ini belirlememk i�in yap�l�r

	}

	private void denemeMethod() {

		System.out.println("Deneme method'u �al��t�");

	}

	public String getOkulIsm�() {
		return okulIsm�;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}

}
