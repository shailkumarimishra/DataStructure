package stack;

public class StackOverflowException extends Exception {
	private String message;
	public StackOverflowException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	
}
