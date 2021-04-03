package day18_Whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// verilen sayýný asal olup olmadýgýný bulan bir program yazýnýz
		//Asal sayý : 1 ve kendisi dýsýnda hýcbýr pozitif tam sayýya bolunmeyen demek
		
		
		int sayi=101;
		
		String flag="Asal"; // bizim istedigimiz sartý gerceklestýrýp gerceklestýrmedýgýný kontrol eder
		
		int bolen=2;
		
		while (bolen<sayi) {
			
			if (sayi%bolen==0) {
				flag="Asal sayý degil";
				
			}
			bolen++;
		}
		
		System.out.println(flag);
		
		
		
		

	}

}
