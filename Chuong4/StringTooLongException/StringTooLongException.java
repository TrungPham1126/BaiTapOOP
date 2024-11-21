package StringTooLongException;

//Định nghĩa ngoại lệ StringTooLongException
class StringTooLongException extends Exception {
	public StringTooLongException(String message) {
		super(message);
	}
}
