package day40_Exception;

public class InvalidEmailIdCheckedException extends Exception {

	private static final long serialVersionUID = 1L; // Java exception'lar�n tekrars�z olmas�n� saglamak i�in her
														// excepiton'a bir unique kod verir.

	InvalidEmailIdCheckedException(String message) {
		super(message);
		
	}

}
