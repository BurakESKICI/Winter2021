package day04_modulusmatematikselislemler;

public class C1_Matematikseliþlemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1= 38 / 2 *(4 + 3)* 2;
		
		System.out.println(num1);
		
		int num2 = 8 + 2 * ( 14 - + 6 / 2) - 12 ; //bu ýslemýn sonucu virgullu oldugu ýcýn
		// ve int de kullanýlýrsa eger výrgulun gerýsýný atar.
		//bu iþlemden sonra double kullanýlýrsa eðer virgullu olan dogru sonucu verýcektýr.
		

		System.out.println( num2);
		
		double num3 = 10;
		
		double num4= num1 * num2 / num3 ;
		
		System.out.println(num4);
		
		double num5 = 24.56 ;
		double num6=14.2;
		double num7= num5 / num6 ;
		
		System.out.println(num7);
		
		System.out.println(num5 / num3 );

		//bu iþlemde de bir tane double kullanýrsak cýktý double a gore ayarlanýcak ve
		// výrgullu kýsmý kaybetmýycez.
		
		// NOTE : eþitliðin sað tarafý yani iþlemlerin yapýldýgý taraf integer ise ve 
		//iþlemin sol tarrafaý yani atanan taraf dobule ise artýk double olarak devam eder 
		
		
		double num8= num1 * num2 / num3 ; // 478.8
		
		System.out.println(num8);
		
		
	}

}
