package day33_encapsulation;

public class Encapsulation03 {
	
	
	
	
	

	public static void main(String[] args) {
		// Encapsulation02 class'�nda ki class member'a ula�maya �al��al�m 
		
		Encapsulation02 obj1 = new Encapsulation02();
		
		// Biz eri�im yetkisini 2'ye ay�r�yoruz
		// 1-) okuyabilme 
		// 2-) degistirip kullanabilme 
		
		System.out.println(obj1.sayi);
		System.out.println(obj1.getOkulIsm�()); // Y�ld�z koleji 
		
		
		obj1.setHesapNo(546789);
		
	
		
		

	}
	
	
	
	
	

}
