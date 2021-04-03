package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		// istedigimiz kadar sayi girdigimizde tum say�lar� toplayan bir method yazal�m
		// Var---- variety (cesitlilik) args-- arguments

		toplama(2, 5);
		toplama(5, 10, 15);
		toplama(4, 5, 9, 7);
		toplama(234, 2343, 234, 12, -213); // 3 nokta koyduk diye art�k Java anl�yorki varargs kullanmak istiyoruz ve
											// buna gore �slem yap�yor.

	}

	public static void toplama(int... i) { // data turunden sonra yazd�g�m�z ... varargs kullanacag�m�z� anl�yor
		
		int toplam=0;
		for (int each : i) {
			toplam+=each;
		}
		System.out.println("toplam :"+ toplam);

	}

}
