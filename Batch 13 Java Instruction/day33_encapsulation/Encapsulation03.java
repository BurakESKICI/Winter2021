package day33_encapsulation;

public class Encapsulation03 {
	
	
	
	
	

	public static void main(String[] args) {
		// Encapsulation02 class'ýnda ki class member'a ulaþmaya çalýþalým 
		
		Encapsulation02 obj1 = new Encapsulation02();
		
		// Biz eriþim yetkisini 2'ye ayýrýyoruz
		// 1-) okuyabilme 
		// 2-) degistirip kullanabilme 
		
		System.out.println(obj1.sayi);
		System.out.println(obj1.getOkulIsmý()); // Yýldýz koleji 
		
		
		obj1.setHesapNo(546789);
		
	
		
		

	}
	
	
	
	
	

}
