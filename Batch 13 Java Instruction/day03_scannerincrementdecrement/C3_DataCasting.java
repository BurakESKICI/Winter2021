package day03_scannerincrementdecrement;

public class C3_DataCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//bbyte veri t��r�nde bir deg�sken olusturup deger atay�n
		//olusturulan variable yi adim adim Auto Widening ile geni�letip yazd�r�n
		
		byte numByte=34 ;
		
		System.out.println("byte deg�sken deger� :"+ numByte);
		
		//short yapal�m
		
		//variable = de�er 
		short numShort= numByte; //short byte dan buyuk oldugu �c�n java sorun olark gormedi
		                           //Auto Widening ile otomatik de�i�tirdi java 
		
		System.out.println("short deg�sken deger� :"+ numShort);
		
		int numInt= numShort;
		
		System.out.println("integer degiskeni"+numShort);
		
		long numLong=numInt;
		
		System.out.println("long degi�keni"+numInt);
		
		float numFloat=numLong;
		
		System.out.println("float deger�n� g�r�n�z"+numFloat);
		
		double numdouble= numFloat;
		
		System.out.println("double deg�sken� " + numdouble);
		
	
		
		
		
		
		
		
	}

}
