package day39_exception;

public class Exception07 {

	public static void main(String[] args) {
		/*
		 * Data turlerini casting yaparken uygun olmayan i�lemleri yapmaz
		 * Java ClassCast
		 */
		
		int sayi=10;
	//	String str=sayi; // CTE
		
		String str="123456";
		
		System.out.println(str+10);  // 12345610
		
		int strSayi=Integer.parseInt(str);
		System.out.println(strSayi+10); // 123466
		
		String str2="123a45";
		System.out.println(Integer.parseInt(str2)); // NumberFormatException
		
		Object sayi2=40;
		String sayiStr=(String)sayi2; // Exclicit narrowing casting 
		                               // ClassCastExcepiton
		
		

	}

}
