package day42_abstractclasses;

public abstract class Personel {
	
	/* Bir class''ý abstract yapmak için class keyword'u once 
	 * abstract yazmak yeterlidir.
	 * 
	 * abstract bir class'ýn icinde variable olabilirmi ?
	 * evet olabilir
	 */
	
	public String isim="Yasin";
	
	/*variable'lar abstract olur mu?
	 * olmaz!!!!
	 */
	 // örnek ;
	//  public abstract int sayi=10;
	
	/* Abstract class'ýn tum concrete child'larý abstract class'daki tum dinamik 
	 * özellikleri override zorundadýr;
	 */
	
	// bir method abstract olur mu ve nasýl yapýlýr ?
	public abstract void maasHesapla();
	public abstract void mesaiBilgisi();
	
	//Bir abstract class'da concrete method yazýlabilir mi ?
	//Bir abstract class'da abstract ve concrete method'lar olabilir.
	// concrete child class'lar abstract methodlarý override ETMEK ZORUNDADÝR ama
	// concrete methodlarý override etmek ýstege baglýdýr.
	public void ozelSigorta() {
		System.out.println("Bu personel özel sigorta kapsamýndadýr");
	}


}
