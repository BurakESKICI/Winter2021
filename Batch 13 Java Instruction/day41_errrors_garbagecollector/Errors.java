package day41_errrors_garbagecollector;

public class Errors {
	
	

	public static void main(String[] args) {
		
		System.out.println(20/0); // RTE de�il RunTimeException
		
	//	String str="asd;   // CTE dur.. ��nk� �ift t�rna�� tamamlamad�k�a kod �al��maz
		// bu tur yaz�mdan kaynaklanan hatalar kolayca d�zeltilebilir
		
		// Java'da Error dendi�inde onune gecilemeyen, kod ile ��z�lemyen 
		// sistemden kaynakl� buyuk hatalar kastedilir.
		
		
		// Error'lar unchecked'dir ve Java bunlar� �ng�remez
		//ancak gerceklesti�inde kodun �al��mas� durdurulur.
		
		String str="";
		for (int i = 0; i < 1000000; i++) {
			str+=i;
		}
		
		/*
		 Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day41_errrors_garbagecollector.Errors.main(Errors.java:9)

bunu verdi :D
		 */
		

	}
	
	
	

}
