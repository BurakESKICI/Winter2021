package day37_overriding;

public class Formen extends Isci {

	public String sorumluOlduguBolum = "bakim";
	public String isim = "Emrullah";

	public static void main(String[] args) {

		// Inheritance'da data t�r� olarak class ismi kullan�m� overriding ile
		// kar�st�r�labilir dikkat edelim !

		// bir class'da obje �retirken data t�r� olarak class',n kendisini veya
		// parent(lar�n�) kullanabiliriz
		// olusturdugumuz obje ile variable kullanmam�z gerkirse , hangi degeri
		// alacag�n� anlamak icin onc eData t�r� olan class'a gideriz orada arad�g�m�z
		// variable varsa kullan�r�z,yoksa parent/lar�na) bakar�z , yukar� dogru derken
		// ilk buldugumuz degeri kullan�r�z

		Formen fr1 = new Formen(); // fr1 objesini kullanarak hangi classlar�n variable'lerini g�rebilirim ?
		fr1.sorumluOlduguBolum = "Marangozhane";
		fr1.maas = 10000;
		System.out.println(fr1.isim + " " + fr1.sorumluOlduguBolum + " " + fr1.maas); // Emre Marangozhane 10000

		Isci fr2 = new Formen();
		// Data t�r� olarak Isci secildigi i�in
		fr2.bolum = "Kaynak atolyesi";

		System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas); // Yakup Kaynak atolyesi 5000
		
		Personel fr3 =new Formen();
	    System.out.println(fr3.isim); // Emre 

	}

}
