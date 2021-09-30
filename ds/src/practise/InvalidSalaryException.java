package practise;

public class InvalidSalaryException extends RuntimeException{
	private String message;
public InvalidSalaryException(String message) {
	this.message=message;
}
public String getMessage() {
	return message;
}

}
