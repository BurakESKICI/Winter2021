package day37_overriding;

public class Formen extends Isci {

	public String sorumluOlduguBolum = "bakim";
	public String isim = "Emrullah";

	public static void main(String[] args) {

		// Inheritance'da data türü olarak class ismi kullanýmý overriding ile
		// karýstýrýlabilir dikkat edelim !

		// bir class'da obje üretirken data türü olarak class',n kendisini veya
		// parent(larýný) kullanabiliriz
		// olusturdugumuz obje ile variable kullanmamýz gerkirse , hangi degeri
		// alacagýný anlamak icin onc eData türü olan class'a gideriz orada aradýgýmýz
		// variable varsa kullanýrýz,yoksa parent/larýna) bakarýz , yukarý dogru derken
		// ilk buldugumuz degeri kullanýrýz

		Formen fr1 = new Formen(); // fr1 objesini kullanarak hangi classlarýn variable'lerini görebilirim ?
		fr1.sorumluOlduguBolum = "Marangozhane";
		fr1.maas = 10000;
		System.out.println(fr1.isim + " " + fr1.sorumluOlduguBolum + " " + fr1.maas); // Emre Marangozhane 10000

		Isci fr2 = new Formen();
		// Data türü olarak Isci secildigi için
		fr2.bolum = "Kaynak atolyesi";

		System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas); // Yakup Kaynak atolyesi 5000
		
		Personel fr3 =new Formen();
	    System.out.println(fr3.isim); // Emre 

	}

}
