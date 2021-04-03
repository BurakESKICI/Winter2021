package day03_scannerincrementdecrement;

public class C5_arttırmaAzaltma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 15;
		
		//bir sayıyı ıkı arttırmak ıstersek ,sayıyı 2 ıle toplarız
		
		int num2 = num + 2 ;
		
	   
	    
		System.out.println("num2 = " + num2);
		System.out.println("num = " + num);
		
		num = num + 5 ;
		
		System.out.println("num = " + num);
		
		num2 = num + 5;
		
		System.out.println("sonnam = " + num2);
		
		//kendi acıklamam!
		//java da atama ıslemı cok onemlıdır.
		//ozellıkle son atamalrı kontrol etmelısın.
		//sagdakı yapılan ıslemler solda ki tanımı verırı ve o tanımı
	    // kullanarak ısleme devam edersın.
		

		//bir sayıyı arttırmak istersek o sayıyı ıstedıgımız sayıyı 
		// ekler ve sonucu varıableye atarız
		
		// num3'ı 8 arttırmak için örnek 
		int num3 = num2 ;
		
		num3 = num + 8;
		System.out.println("num3 : "+num3);
		
		
		  
		//karakter toplamasını hızlı bır sekılde yapmak ıcın bu kodu 
		//bu sekılde hızlı yapabılırsın bu tavsıye edılır
		
		num3 += 5 ;
		
		System.out.println("num3 degeri : "+ num3);
		
		//num3 1 arttırma
		
		num3+=1;
				System.out.println("num3 : " +num3);
				// yada daha kolay bi şekşild sadece 1 attırmak ıcın sunu kullan
			num3++;
			
			System.out.println("num3 deger:" +num3);
			
			
				
	}

}
