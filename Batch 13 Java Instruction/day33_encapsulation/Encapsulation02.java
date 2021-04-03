package day33_encapsulation;

public class Encapsulation02 {

	private String okulIsmý = "Yýldýz koleji";
	// Okul isminin baþka class'lardan okunmasýný ama deger atanamamasýný istiyorsak
	// getter() method'u kullanýlýr ,oluþturulur

	private String tcNo = "12345678901";
	private int hesapNo = 5554321;
	public int sayi =1234;
	// obje olusturularak deger atanýp kullanýlmasýný istedigimiz ama ilk atadýgýmýz
	// degerýn gorunmemesini istiyorsak setter() method'u kullanýlýr.

	public static void main(String[] args) {
		// eger ulasmak istedigim class uyeleri(clas member) public degilse baska
		// package'leden ulasmka ýcýn extra iþlem gerekir.

		// Yapabilecegimiz iþlemlerden 1. si Encapsulation ( Data saklama)
		// bu Class'da kimseyle paylaþmak istemediðimiz variable ve method'lar
		// olusturalým

		// private yapýnca guvenlik konusunu halletmiþ olduk ancak class üyelelerinin
		// private olmasý OOP concept'e aykýrý

		// Encapsulation class'ýmýzda olusturdugumuz class üyelerine kimlerin ne oranda
		// ulaþabileceðini belirlememk için yapýlýr

	}

	private void denemeMethod() {

		System.out.println("Deneme method'u çalýþtý");

	}

	public String getOkulIsmý() {
		return okulIsmý;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}

}
