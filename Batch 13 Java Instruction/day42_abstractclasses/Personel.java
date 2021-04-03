package day42_abstractclasses;

public abstract class Personel {
	
	/* Bir class''� abstract yapmak i�in class keyword'u once 
	 * abstract yazmak yeterlidir.
	 * 
	 * abstract bir class'�n icinde variable olabilirmi ?
	 * evet olabilir
	 */
	
	public String isim="Yasin";
	
	/*variable'lar abstract olur mu?
	 * olmaz!!!!
	 */
	 // �rnek ;
	//  public abstract int sayi=10;
	
	/* Abstract class'�n tum concrete child'lar� abstract class'daki tum dinamik 
	 * �zellikleri override zorundad�r;
	 */
	
	// bir method abstract olur mu ve nas�l yap�l�r ?
	public abstract void maasHesapla();
	public abstract void mesaiBilgisi();
	
	//Bir abstract class'da concrete method yaz�labilir mi ?
	//Bir abstract class'da abstract ve concrete method'lar olabilir.
	// concrete child class'lar abstract methodlar� override ETMEK ZORUNDAD�R ama
	// concrete methodlar� override etmek �stege bagl�d�r.
	public void ozelSigorta() {
		System.out.println("Bu personel �zel sigorta kapsam�ndad�r");
	}


}
