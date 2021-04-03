package day31_varargsstringbuilder;

public class C6_StringBuilder01 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder(); // Bos bir SB olusturur.
		System.out.println("sb1 : " + sb1);

		StringBuilder sb2 = new StringBuilder("Mehmet"); // içinde Mehmet degeri olan bir SB degeri uretýr
		System.out.println("sb2 : " + sb2);

		StringBuilder sb3 = new StringBuilder(10); // 10 karakter kapasitesi olan bir StringBuilder üretir.
		System.out.println("sb3 : " + sb3);

		sb1.append(" HOCA");
		System.out.println("sb1 append : " + sb1);// HOCA

		sb2.append(" HOCA");
		System.out.println("sb2 append : " + sb2); // Mehmet HOCA

		sb3.append(" HOCA");
		System.out.println("sb3 append : " + sb3); // HOCA

		System.out.println("sb1 uzunluk " + sb1.length());  //5
		System.out.println("sb1 kapasite " + sb1.capacity());// 16

		System.out.println("sb2 uzunluk " + sb2.length()); // 11
		System.out.println("sb2 kapasite " + sb2.capacity());  //22

		System.out.println("sb3 uzunluk " + sb3.length());  // 5 
		System.out.println("sb3 kapasite " + sb3.capacity());  // 10

		/*
		 * NOTE :capacity ile length() ayný degýl capacity boþta kalan alaný veriyor
		 * eger bosta kalan alan kalmaýysa ve sýnýr asýldýysa deafult degerleri veriyor
		 * ama bizim icin cokta onemlý degýl genel olarak capacity ile length'in ayný
		 * olmadýgýný býlmemýz gerek
		 * 
		 *  capacity hafiza yönetimi için önemli 
		 *  kod yazýlýrken sabit uzunluk yada max. uzunluk belli ise 
		 *  3.method ile olusturarak HAFIZA KULLANIMINI optimize edebiliriz.
		 */

	}

}
