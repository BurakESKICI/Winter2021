package day04_modulusmatematikselislemler;

public class C1_Matematikseli�lemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1= 38 / 2 *(4 + 3)* 2;
		
		System.out.println(num1);
		
		int num2 = 8 + 2 * ( 14 - + 6 / 2) - 12 ; //bu �slem�n sonucu virgullu oldugu �c�n
		// ve int de kullan�l�rsa eger v�rgulun ger�s�n� atar.
		//bu i�lemden sonra double kullan�l�rsa e�er virgullu olan dogru sonucu ver�cekt�r.
		

		System.out.println( num2);
		
		double num3 = 10;
		
		double num4= num1 * num2 / num3 ;
		
		System.out.println(num4);
		
		double num5 = 24.56 ;
		double num6=14.2;
		double num7= num5 / num6 ;
		
		System.out.println(num7);
		
		System.out.println(num5 / num3 );

		//bu i�lemde de bir tane double kullan�rsak c�kt� double a gore ayarlan�cak ve
		// v�rgullu k�sm� kaybetm�ycez.
		
		// NOTE : e�itli�in sa� taraf� yani i�lemlerin yap�ld�g� taraf integer ise ve 
		//i�lemin sol tarrafa� yani atanan taraf dobule ise art�k double olarak devam eder 
		
		
		double num8= num1 * num2 / num3 ; // 478.8
		
		System.out.println(num8);
		
		
	}

}
