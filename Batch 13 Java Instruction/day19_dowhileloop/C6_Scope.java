package day19_dowhileloop;

public class C6_Scope {

	public static void main(String[] args) {
		
		//bir klass �cer�s�nde olusturulan var�ableler�n nerede gecerl� oldugu 
		//ve nereden kullan�lab�ld�g�n� o var�able'n�n Scope'u bel�rler
		//Java'da Scope nedir ? google'da arast�r 
		
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
