package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		// istedigimiz kadar sayi girdigimizde tum sayýlarý toplayan bir method yazalým
		// Var---- variety (cesitlilik) args-- arguments

		toplama(2, 5);
		toplama(5, 10, 15);
		toplama(4, 5, 9, 7);
		toplama(234, 2343, 234, 12, -213); // 3 nokta koyduk diye artýk Java anlýyorki varargs kullanmak istiyoruz ve
											// buna gore ýslem yapýyor.

	}

	public static void toplama(int... i) { // data turunden sonra yazdýgýmýz ... varargs kullanacagýmýzý anlýyor
		
		int toplam=0;
		for (int each : i) {
			toplam+=each;
		}
		System.out.println("toplam :"+ toplam);

	}

}
