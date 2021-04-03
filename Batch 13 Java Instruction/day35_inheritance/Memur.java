package day35_inheritance;

public class Memur extends Personel {

	public int maas;

	public Memur() { // 3. cal�st�
		super(); // 4. cal�st� // �al��ma s�ras� buraya gelince super(); keyword'�n� g�r�nce bizi
					// parent class'daki parametresiz cons'a g�t�rd� ve ilk olarak oradaki cons
					// �al��t� :D
		System.out.println("Child class parametresiz cons. cal��t�"); // 7. cal�st�
	}
	
	public Memur(int maas) {//*3. cal�st�
		super("",526);//*4. cal�st� 
		System.out.println("Child class parametreli cons. cal��t�");  //*7 cal�st� 
		}
	
	
	/*
	 * Inheritance'da constructor olusturdugumuzda java'n�n otomatik olarak
	 * constructor'a koydugu super() keyword �nemlidir.
	 *  super () keyword default constructor gibidir.
	 * Biz gormesek de cal�s�r, ancak yerine baska bir keyword
	 * yazarsaketkisiz hale gelir 
	 * Extends varsa yerine bir�ey yazmad�k�a super() cali�ir.
	 * ** k�saca super()'i yazmasakta orada extends
	 * oldugu i�in sanki super varm�s gibi davran�p yoluna devam edicek **
	 */

	public static void main(String[] args) { // 1. cal�st� //*1. cal�st�

		Memur obj1 = new Memur(2400); // 2. cal�st� //*2. durum main i�erisinde busefer int deger var!

	}
	

}
