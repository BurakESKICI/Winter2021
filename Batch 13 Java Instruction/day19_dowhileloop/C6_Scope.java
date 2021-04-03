package day19_dowhileloop;

public class C6_Scope {

	public static void main(String[] args) {
		
		//bir klass ýcerýsýnde olusturulan varýablelerýn nerede gecerlý oldugu 
		//ve nereden kullanýlabýldýgýný o varýable'nýn Scope'u belýrler
		//Java'da Scope nedir ? google'da arastýr 
		
		int sayi=10;
		
		denemeMethod();
		sayi++;
		System.out.println(sayi);
		

	}

	public static void denemeMethod() {
		// sayi=20;
		String isim="Burak";
		
		
	}

}
