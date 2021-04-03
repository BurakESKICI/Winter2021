package day34_inheritence;

public class Muhasebe extends Personel{

	// Muhasebe class'ýnýn personel class'ýnýn child class'i oldugunu declare etmek
	// için class ismine "extends" keyword ile parent class'i yazarýz
	
	public int saatücreti;
	public String statü;
	public int maas;
	
	
	public int maasHesapla() {
		
		maas=30*8*saatücreti;
		
		return maas;
	}

}
