package day18_Whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// verilen say�n� asal olup olmad�g�n� bulan bir program yaz�n�z
		//Asal say� : 1 ve kendisi d�s�nda h�cb�r pozitif tam say�ya bolunmeyen demek
		
		
		int sayi=101;
		
		String flag="Asal"; // bizim istedigimiz sart� gerceklest�r�p gerceklest�rmed�g�n� kontrol eder
		
		int bolen=2;
		
		while (bolen<sayi) {
			
			if (sayi%bolen==0) {
				flag="Asal say� degil";
				
			}
			bolen++;
		}
		
		System.out.println(flag);
		
		
		
		

	}

}
