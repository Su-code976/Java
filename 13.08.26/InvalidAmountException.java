package bank_app;

public class InvalidAmountException extends Exception{
	public InvalidAmountException(String msg) {
		super(msg);
	}
}
