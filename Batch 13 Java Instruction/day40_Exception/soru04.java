package day40_Exception;

public class soru04 {

	public static void main(String[] args) {
		
			try {
				�al��();
			} catch (Exception e) {
				System.out.println(e.getMessage()); // getMessage aciklamasi : the detail mesage string of this Throwable instance(Which may be null)
			}
	}
	private static void �al��() {
		throw new RuntimeException(); // Parametre icerisine bir mesaj yazmak isek null degerini verir.
	}
	}