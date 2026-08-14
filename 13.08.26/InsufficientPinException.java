package bank_app;
public class InsufficientPinException extends Exception{
	public InsufficientPinException(String msg) {
		super(msg);
	}

}
