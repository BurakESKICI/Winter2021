package day04_modulusmatematikselislemler;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//modulus operat�r� b�lme i�leminde kalan� verir
		
		//15 tek mi �ift mi ? 15/2 kalan =1 ise bu tektir.(klas�k mat denklemi)
		//25 ��e b�l�n�r m� ? 25/3 kalan= 1
		//herhangi bir say�n�n 7 ile boluneb�ld�gn� kontrol etmek i�in 
		//modulu i�lemi kullan�r�z
		//modulus i�areti % budur
		//�RNEK
		
		
		int kalan= 51 % 4 ;
		System.out.println(kalan); 
		
		System.out.println(26 % 8 ); // kalan 2
		
		//856 say�s�n�n b�rler basamag� kact�r ? 6
		int sayi= 856 ;
		
		int birlerbasamg� = sayi % 10 ;
		System.out.println("say�n�n birler basamag� : " +birlerbasamg�);
		
		//856 say�s�n�n 10 lar absamag� kact�r ? 
		
	 sayi/=10 ;
	 
	 System.out.println("on'a b�l�nd�kten sonraki de�eri : "+ sayi);
	 
	 
	int onlarBasamagi = sayi %10 ;
	System.out.println("onlar basamagi ; "+ onlarBasamagi);
	
	//y�zler basamnagg�na gitmek i�in bir kere daha ayn� �slem� yap�cam 
	
	sayi/=10; // bu satirla onlar basamag�ndan da kurtuluyorum
	System.out.println("2.defa 10'a b�ld�kten sonra " + sayi);
	 int yuzlerBasamagi= sayi;
	 
	 System.out.println(yuzlerBasamagi);
	 
	
	
	
	
	
	}

}
