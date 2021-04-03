package day03_scannerincrementdecrement;

public class C3_DataCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//bbyte veri tüüründe bir degýsken olusturup deger atayýn
		//olusturulan variable yi adim adim Auto Widening ile geniþletip yazdýrýn
		
		byte numByte=34 ;
		
		System.out.println("byte degýsken degerý :"+ numByte);
		
		//short yapalým
		
		//variable = deðer 
		short numShort= numByte; //short byte dan buyuk oldugu ýcýn java sorun olark gormedi
		                           //Auto Widening ile otomatik deðiþtirdi java 
		
		System.out.println("short degýsken degerý :"+ numShort);
		
		int numInt= numShort;
		
		System.out.println("integer degiskeni"+numShort);
		
		long numLong=numInt;
		
		System.out.println("long degiþkeni"+numInt);
		
		float numFloat=numLong;
		
		System.out.println("float degerýný gýrýnýz"+numFloat);
		
		double numdouble= numFloat;
		
		System.out.println("double degýskený " + numdouble);
		
	
		
		
		
		
		
		
	}

}
