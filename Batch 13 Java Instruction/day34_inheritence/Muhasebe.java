package day34_inheritence;

public class Muhasebe extends Personel{

	// Muhasebe class'�n�n personel class'�n�n child class'i oldugunu declare etmek
	// i�in class ismine "extends" keyword ile parent class'i yazar�z
	
	public int saat�creti;
	public String stat�;
	public int maas;
	
	
	public int maasHesapla() {
		
		maas=30*8*saat�creti;
		
		return maas;
	}

}
