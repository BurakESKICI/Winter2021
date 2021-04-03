package day42_abstractclasses;

public class ��ci extends Personel {

	public static void main(String[] args) {
		��ci isci1= new ��ci();
		isci1.maasHesapla(); // isciler icin maas 5000 tl 
		isci1.mesaiBilgisi(); //isciler gunluk 8 saat cal�s�r
		isci1.isim="Rumeysa"; // abstract parent class'daki variable'lar� �stersem kullanab�l�r�m
		System.out.println(isci1.isim);
		isci1.ozelSigorta(); // abstract class'daki concrete methodu �stersem kullan�r�m :D 
                             //Bu personel ozel sigorta kapsam�ndad�r
		                      // Bu method'u override etmedik ama parent-child ili�kisi ile kullanab�l�rd�k
	}

	@Override
	public void maasHesapla() {
		//  parent class'daki abstract method'u implement (uyarlmaa) etti
		// 1- sen abstract bir class'� parent edindiysen mutlaka oradaki abstract methodu 
		// implement etmelisin 
		//2- parent class'dai method'da body olmad�g� �c�n onu kullanman�n anlmam� yok 
		// biz child  class'da body olan method (concrete) kullan�p �slem yapmal�y�z
		System.out.println("�sciler i�in maas 5000tl");
		
		
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("isciler gunluk 8 saat cal�s�r");
		
	}

}
