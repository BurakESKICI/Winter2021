package day21_Scope;

public class Scope4 {

	public static void main(String[] args) {

		int sayi = 10;
		// 1-) bir method icinde olusturulan variable sadece o method �c�nde
		// kullan�labilir
		// 1-) System.out.println(isim);

		int sayi2; // 2-) bir local variable deger atamadan da olusturabiliriz
		// 2-) System.out.println(sayi2);// ancak ilk deger atamas� yap�lmayan
		// variable'ler
		// kullan�lamaz
		// 2-) sayi2++; // say�n�n ilk degeri belli degilki neyi artt�r�cak burada :)
		// 2-) java deger atamas� olmadan local variable olusturulmas�na izin verir,
		// ileride
		// deger atanacak diye bekler

		sayi2 = 15; // 2-) olusturma ayri satirda (11.satir) , deger atamasi ayri satirda (16.
					// satir) yapilabilir

		// 3-) birden fazla method'un oldugu class'larda her method'DA kullanmam�z
		// 3-) gereken ortak variable'ler varsa class level'da variable olusturmal�y�m 
		// 3-) ortak variable class'in yap�s�na bagli olarak instance veya static olabilir

	}

	public static void staticMethod() {

		String isim = "Hasan";
		// 1-) System.out.println(sayi); bu kurala main method icerisinde olusturulan
		// variable'ler de dahildir

	}

	public void method() {

		boolean isTrue = true;
		// 1-) System.out.println(sayi); bu kural static olmayan veyaa olanlar icinde
		// gecerlidir

	}

}
