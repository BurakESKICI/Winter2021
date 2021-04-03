package day43_interfaces;

public interface Interface01 {

	
	public void motor();/* interface i�inde abstract method'lar ve 
	                     �zel concrete method'lar� olablir
	                     */
	
	/*
	 Bir abstract method'un body'si olmad�g�ndan o method'un istenen dinamik �zelli�i 
	 nas�l gercekleseceg�n� b�lmem�z mumkun deg�ld�r
	 sadece ne yapacag�n� biliriz.
	 
	 
	 Bu method bize sunu anlat�r
	 beni inherit eden her concrete class'�n dinamik motor ozell�g� olmal�d�r.
	 
	 */
	
	
	void vites(); //  beni inherit eden her concrete class'�n dinamik vites ozell�g� olmal�d�r.
	abstract void kasa();//  beni inherit eden her concrete class'�n dinamik kasa ozell�g� olmal�d�r.
	
	// Interface'de sadece ABSTRACT, PUBL�C method'lar olur
	// bu iki keyword'� yazsak da yazmasak da Java t�m method'lar� bu �ekilde kabul eder,
	
	// JAva'da interfaces olusturmak istiyorsal ba�tan o �ekilde olu�turmal�y�z
	// bir class sonradan baz� keywordler yaz�larak interface YAPILAMAZ.
	
	
	String ISIM="Mustafa"; // Java isim kelimesini italik ve bold yapt�
	                       // Demekki t�m variable'ler final ve static'tir
	
}
