package day04_modulusmatematikselislemler;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//modulus operatörü bölme iþleminde kalaný verir
		
		//15 tek mi çift mi ? 15/2 kalan =1 ise bu tektir.(klasýk mat denklemi)
		//25 üçe bölünür mü ? 25/3 kalan= 1
		//herhangi bir sayýnýn 7 ile bolunebýldýgný kontrol etmek için 
		//modulu iþlemi kullanýrýz
		//modulus iþareti % budur
		//ÖRNEK
		
		
		int kalan= 51 % 4 ;
		System.out.println(kalan); 
		
		System.out.println(26 % 8 ); // kalan 2
		
		//856 sayýsýnýn býrler basamagý kactýr ? 6
		int sayi= 856 ;
		
		int birlerbasamgý = sayi % 10 ;
		System.out.println("sayýnýn birler basamagý : " +birlerbasamgý);
		
		//856 sayýsýnýn 10 lar absamagý kactýr ? 
		
	 sayi/=10 ;
	 
	 System.out.println("on'a bölündükten sonraki deðeri : "+ sayi);
	 
	 
	int onlarBasamagi = sayi %10 ;
	System.out.println("onlar basamagi ; "+ onlarBasamagi);
	
	//yüzler basamnaggýna gitmek için bir kere daha ayný ýslemý yapýcam 
	
	sayi/=10; // bu satirla onlar basamagýndan da kurtuluyorum
	System.out.println("2.defa 10'a böldükten sonra " + sayi);
	 int yuzlerBasamagi= sayi;
	 
	 System.out.println(yuzlerBasamagi);
	 
	
	
	
	
	
	}

}
