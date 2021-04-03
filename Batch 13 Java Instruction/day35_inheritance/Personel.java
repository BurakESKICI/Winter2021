package day35_inheritance;

public class Personel {

	public String isim;
	public int sayi;

	public Personel() { // 5. cal�st� // *5. cal�st� // parametresiz bir cons. olusturdum Source'den 
		 // super();
		/*
		 * Java'dan yard�m alarak bir cons. olusturdugumuzda ,
		 * Java cons.un ilk sat�r�na super(); keyword'�n� ekler
		 * E�er i�inde oldugumuz class bir child class deg�lse super(); keyword'� silinebilir.
		 * Bug�ne kadar biz olusturdugumuz cons.larda hic super(); keyword'u kullanmad�k
		 * ancak bizim classlarimiz child class olmad�g�ndan sorun olmad�.
		 */
		System.out.println("Personel parametresiz cons. calisti");  // 6. cal�st� // * 6. cal�st�
		
	}


	public Personel(String isim, int sayi) { // parametreli bir cons. olusturdum Source'den 
		super();
		System.out.println("bura cal�st�");
		
	}

	

	/*
	 * Her class deafult constructor'a sahiptir. Default constructor'in parametresi
	 * yoktur. Biz parametreli veya parametresiz bir constructor olusturdugumumuzda
	 * default cons. silinir E�er biz sadece 1 parametreli cons. olusturursak,Java
	 * deafult olani sildigi i�in parametresiz cons. kalmaz Dolay�s�yla parametreli
	 * bir cons. olusturdugumuzda mutlaka default cons. yerine de parametresiz bir
	 * cons. olusturmam�z gerekir.
	 */

}
