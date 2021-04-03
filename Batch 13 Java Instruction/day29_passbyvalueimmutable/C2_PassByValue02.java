package day29_passbyvalueimmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {

		/*
		 * Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method
		 * olusturun. - Method’da indirim uygulayip fiyati main method’da yazdirin
		 * -Method’lari arka arkaya cagirip dogru calistiklarini kontrol edin
		 */

		double fiyat = 100;

		System.out.println("%10 indirimli fiyat :" + indirimUygula10(fiyat));
		System.out.println("%20 indirimli fiyatý :" + indirimUygula20(fiyat));
		System.out.println("%25 indirimli fiyatý :" + indirimUygula25(fiyat));
		System.out.println("method call'dan sonraki fiyat:" + fiyat);// burada 16,17,18. satýrlardaki iþlemlerden
																		// etkilenmez onlar ayrý methodlarda yapýldý
																		// cunku burasý maýn method bu yüzden þunu
																		// unutmamamk lazým METHOD'DA YAPILAN METHOD'DA
																		// KALIR.

	}

	public static double indirimUygula25(double fiyat) {
		fiyat *= 0.75;
		return fiyat;
	}

	public static double indirimUygula20(double fiyat) {
		fiyat *= 0.80;
		return fiyat;
	}

	public static double indirimUygula10(double fiyat) {

		fiyat *= 0.90;

		return fiyat;
	}

}
