package day42_abstractclasses;

public class Ýþci extends Personel {

	public static void main(String[] args) {
		Ýþci isci1= new Ýþci();
		isci1.maasHesapla(); // isciler icin maas 5000 tl 
		isci1.mesaiBilgisi(); //isciler gunluk 8 saat calýsýr
		isci1.isim="Rumeysa"; // abstract parent class'daki variable'larý ýstersem kullanabýlýrým
		System.out.println(isci1.isim);
		isci1.ozelSigorta(); // abstract class'daki concrete methodu ýstersem kullanýrým :D 
                             //Bu personel ozel sigorta kapsamýndadýr
		                      // Bu method'u override etmedik ama parent-child iliþkisi ile kullanabýlýrdýk
	}

	@Override
	public void maasHesapla() {
		//  parent class'daki abstract method'u implement (uyarlmaa) etti
		// 1- sen abstract bir class'ý parent edindiysen mutlaka oradaki abstract methodu 
		// implement etmelisin 
		//2- parent class'dai method'da body olmadýgý ýcýn onu kullanmanýn anlmamý yok 
		// biz child  class'da body olan method (concrete) kullanýp ýslem yapmalýyýz
		System.out.println("Ýsciler için maas 5000tl");
		
		
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("isciler gunluk 8 saat calýsýr");
		
	}

}
