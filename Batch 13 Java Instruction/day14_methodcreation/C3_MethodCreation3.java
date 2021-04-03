package day14_methodcreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {

		// verilen 3 double sayinin ortalamasini alan bir method yazin
		// main method icinden cagirarak method'u calistirin.

		ortalama(82.5, 86.7,87.4 ); // method bu 1.ye gider calistirr
        ortalama (85,86);// bu methýod 2.ye gider ve calisir
	}// MM sonu

	public static void ortalama(double sayi1, double sayi2, double sayi3) {
		System.out.println("girdiginiz 3 sayinin ortlamasi :" + (sayi1 + sayi2 + sayi3) / 3);

	}

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdiginiz 2 sayinin ortlamasi :" + (sayi1 + sayi2) / 2);

	}//C Sonu
}
