package bank_app;

public class AccountNotFoundException extends Exception{
	public AccountNotFoundException(String msg){
		super(msg);
	}
}
