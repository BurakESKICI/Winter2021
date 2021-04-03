package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {

		toplama(2, 5);
		toplama(5, 10, 15);
		toplama(4, 5, 9, 7);
		toplama(234, 2343, 234, 12, -213);

	}

	public static void toplama(int sayi, int... i) { // burasý önemli burada olan sey yukarýdaki degerlerden ilkini "int
														// sayi" alýr o aldýktan sonraki gelecek sayýlarýn hepsini
														// varargs alýr var args'ýn sýnýrý yok depolayabiliyoruzburada
														// ilk degiskeni ayýrmayý gorduk dýyebiliriz.sayi'yi print
														// yaparsak eger yukarýdaki degerlerin ilkini yazdýrýcaktýr
		int toplam = 0;
		for (int each : i) {
			toplam += each;
		}
		System.out.println("toplam :" + toplam);

	}

}
