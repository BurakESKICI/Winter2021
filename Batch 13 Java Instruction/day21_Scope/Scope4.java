package day21_Scope;

public class Scope4 {

	public static void main(String[] args) {

		int sayi = 10;
		// 1-) bir method icinde olusturulan variable sadece o method ýcýnde
		// kullanýlabilir
		// 1-) System.out.println(isim);

		int sayi2; // 2-) bir local variable deger atamadan da olusturabiliriz
		// 2-) System.out.println(sayi2);// ancak ilk deger atamasý yapýlmayan
		// variable'ler
		// kullanýlamaz
		// 2-) sayi2++; // sayýnýn ilk degeri belli degilki neyi arttýrýcak burada :)
		// 2-) java deger atamasý olmadan local variable olusturulmasýna izin verir,
		// ileride
		// deger atanacak diye bekler

		sayi2 = 15; // 2-) olusturma ayri satirda (11.satir) , deger atamasi ayri satirda (16.
					// satir) yapilabilir

		// 3-) birden fazla method'un oldugu class'larda her method'DA kullanmamýz
		// 3-) gereken ortak variable'ler varsa class level'da variable olusturmalýyým 
		// 3-) ortak variable class'in yapýsýna bagli olarak instance veya static olabilir

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
