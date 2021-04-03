package day41_errrors_garbagecollector;

public class Errors {
	
	

	public static void main(String[] args) {
		
		System.out.println(20/0); // RTE deðil RunTimeException
		
	//	String str="asd;   // CTE dur.. çünkü çift týrnaðý tamamlamadýkça kod çalýþmaz
		// bu tur yazýmdan kaynaklanan hatalar kolayca düzeltilebilir
		
		// Java'da Error dendiðinde onune gecilemeyen, kod ile çözülemyen 
		// sistemden kaynaklý buyuk hatalar kastedilir.
		
		
		// Error'lar unchecked'dir ve Java bunlarý öngöremez
		//ancak gerceklestiðinde kodun çalýþmasý durdurulur.
		
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
