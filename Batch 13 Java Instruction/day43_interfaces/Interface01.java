package day43_interfaces;

public interface Interface01 {

	
	public void motor();/* interface içinde abstract method'lar ve 
	                     özel concrete method'larý olablir
	                     */
	
	/*
	 Bir abstract method'un body'si olmadýgýndan o method'un istenen dinamik özelliði 
	 nasýl gerceklesecegýný býlmemýz mumkun degýldýr
	 sadece ne yapacagýný biliriz.
	 
	 
	 Bu method bize sunu anlatýr
	 beni inherit eden her concrete class'ýn dinamik motor ozellýgý olmalýdýr.
	 
	 */
	
	
	void vites(); //  beni inherit eden her concrete class'ýn dinamik vites ozellýgý olmalýdýr.
	abstract void kasa();//  beni inherit eden her concrete class'ýn dinamik kasa ozellýgý olmalýdýr.
	
	// Interface'de sadece ABSTRACT, PUBLÝC method'lar olur
	// bu iki keyword'ü yazsak da yazmasak da Java tüm method'larý bu þekilde kabul eder,
	
	// JAva'da interfaces olusturmak istiyorsal baþtan o þekilde oluþturmalýyýz
	// bir class sonradan bazý keywordler yazýlarak interface YAPILAMAZ.
	
	
	String ISIM="Mustafa"; // Java isim kelimesini italik ve bold yaptý
	                       // Demekki tüm variable'ler final ve static'tir
	
}
