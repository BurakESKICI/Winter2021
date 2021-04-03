package day35_inheritance;

public class Memur extends Personel {

	public int maas;

	public Memur() { // 3. calýstý
		super(); // 4. calýstý // çalýþma sýrasý buraya gelince super(); keyword'ünü görünce bizi
					// parent class'daki parametresiz cons'a götürdü ve ilk olarak oradaki cons
					// çalýþtý :D
		System.out.println("Child class parametresiz cons. calýþtý"); // 7. calýstý
	}
	
	public Memur(int maas) {//*3. calýstý
		super("",526);//*4. calýstý 
		System.out.println("Child class parametreli cons. calýþtý");  //*7 calýstý 
		}
	
	
	/*
	 * Inheritance'da constructor olusturdugumuzda java'nýn otomatik olarak
	 * constructor'a koydugu super() keyword önemlidir.
	 *  super () keyword default constructor gibidir.
	 * Biz gormesek de calýsýr, ancak yerine baska bir keyword
	 * yazarsaketkisiz hale gelir 
	 * Extends varsa yerine birþey yazmadýkça super() caliþir.
	 * ** kýsaca super()'i yazmasakta orada extends
	 * oldugu için sanki super varmýs gibi davranýp yoluna devam edicek **
	 */

	public static void main(String[] args) { // 1. calýstý //*1. calýstý

		Memur obj1 = new Memur(2400); // 2. calýstý //*2. durum main içerisinde busefer int deger var!

	}
	

}
