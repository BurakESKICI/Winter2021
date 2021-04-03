package day35_inheritance;

public class Personel {

	public String isim;
	public int sayi;

	public Personel() { // 5. calýstý // *5. calýstý // parametresiz bir cons. olusturdum Source'den 
		 // super();
		/*
		 * Java'dan yardým alarak bir cons. olusturdugumuzda ,
		 * Java cons.un ilk satýrýna super(); keyword'ünü ekler
		 * Eðer içinde oldugumuz class bir child class degýlse super(); keyword'ü silinebilir.
		 * Bugüne kadar biz olusturdugumuz cons.larda hic super(); keyword'u kullanmadýk
		 * ancak bizim classlarimiz child class olmadýgýndan sorun olmadý.
		 */
		System.out.println("Personel parametresiz cons. calisti");  // 6. calýstý // * 6. calýstý
		
	}


	public Personel(String isim, int sayi) { // parametreli bir cons. olusturdum Source'den 
		super();
		System.out.println("bura calýstý");
		
	}

	

	/*
	 * Her class deafult constructor'a sahiptir. Default constructor'in parametresi
	 * yoktur. Biz parametreli veya parametresiz bir constructor olusturdugumumuzda
	 * default cons. silinir Eðer biz sadece 1 parametreli cons. olusturursak,Java
	 * deafult olani sildigi için parametresiz cons. kalmaz Dolayýsýyla parametreli
	 * bir cons. olusturdugumuzda mutlaka default cons. yerine de parametresiz bir
	 * cons. olusturmamýz gerekir.
	 */

}
