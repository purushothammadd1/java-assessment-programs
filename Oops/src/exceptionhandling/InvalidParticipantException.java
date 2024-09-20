package exceptionhandling;

public class InvalidParticipantException extends Exception {
	// private String message;
	public InvalidParticipantException(String message) {
		super(message);
		// this.message=message;
	}

	public String getMessage() {
//		return message;
		return super.getMessage();
	}

}
