package day03_scannerincrementdecrement;

public class C5_artt�rmaAzaltma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 15;
		
		//bir say�y� �k� artt�rmak �stersek ,say�y� 2 �le toplar�z
		
		int num2 = num + 2 ;
		
	   
	    
		System.out.println("num2 = " + num2);
		System.out.println("num = " + num);
		
		num = num + 5 ;
		
		System.out.println("num = " + num);
		
		num2 = num + 5;
		
		System.out.println("sonnam = " + num2);
		
		//kendi ac�klamam!
		//java da atama �slem� cok oneml�d�r.
		//ozell�kle son atamalr� kontrol etmel�s�n.
		//sagdak� yap�lan �slemler solda ki tan�m� ver�r� ve o tan�m�
	    // kullanarak �sleme devam eders�n.
		

		//bir say�y� artt�rmak istersek o say�y� �sted�g�m�z say�y� 
		// ekler ve sonucu var�ableye atar�z
		
		// num3'� 8 artt�rmak i�in �rnek 
		int num3 = num2 ;
		
		num3 = num + 8;
		System.out.println("num3 : "+num3);
		
		
		  
		//karakter toplamas�n� h�zl� b�r sek�lde yapmak �c�n bu kodu 
		//bu sek�lde h�zl� yapab�l�rs�n bu tavs�ye ed�l�r
		
		num3 += 5 ;
		
		System.out.println("num3 degeri : "+ num3);
		
		//num3 1 artt�rma
		
		num3+=1;
				System.out.println("num3 : " +num3);
				// yada daha kolay bi �ek�ild sadece 1 att�rmak �c�n sunu kullan
			num3++;
			
			System.out.println("num3 deger:" +num3);
			
			
				
	}

}
