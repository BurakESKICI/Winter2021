package day40_Exception;

public class InvalidEmailIdCheckedException extends Exception {

	private static final long serialVersionUID = 1L; // Java exception'larýn tekrarsýz olmasýný saglamak için her
														// excepiton'a bir unique kod verir.

	InvalidEmailIdCheckedException(String message) {
		super(message);
		
	}

}
