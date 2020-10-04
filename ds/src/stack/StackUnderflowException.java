package stack;

public class StackUnderflowException extends Exception {
	private String message;
	public StackUnderflowException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	
	
}
