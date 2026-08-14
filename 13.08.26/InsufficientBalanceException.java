package bank_app;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}

}
