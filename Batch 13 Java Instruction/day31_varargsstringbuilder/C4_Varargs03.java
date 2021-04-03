package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {

		toplama(2, 5);
		toplama(5, 10, 15);
		toplama(4, 5, 9, 7);
		toplama(234, 2343, 234, 12, -213);

	}

	public static void toplama(int sayi, int... i) { // buras� �nemli burada olan sey yukar�daki degerlerden ilkini "int
														// sayi" al�r o ald�ktan sonraki gelecek say�lar�n hepsini
														// varargs al�r var args'�n s�n�r� yok depolayabiliyoruzburada
														// ilk degiskeni ay�rmay� gorduk d�yebiliriz.sayi'yi print
														// yaparsak eger yukar�daki degerlerin ilkini yazd�r�cakt�r
		int toplam = 0;
		for (int each : i) {
			toplam += each;
		}
		System.out.println("toplam :" + toplam);

	}

}
