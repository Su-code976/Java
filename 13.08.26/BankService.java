package bank_app;

public class BankService{
    double currentBalance=350000;
    long nums[] = {10029,10002,1004,2030};
    void searchAccount(long accNo) throws AccountNotFoundException {
        boolean flag=false;
        for(long num:nums) {
            if(num==accNo) {
                System.out.println("Account found");
                flag=true;
                break;
            }
        }
        if(!flag)
            throw new AccountNotFoundException("Account Not Found");
    }
    void withdrawl(float amount)throws InsufficientBalanceException, InvalidAmountException{
    	if(amount<=0)
    		throw new InvalidAmountException("Invaild Amount");
    	if(amount>currentBalance)
    		throw new InsufficientBalanceException("Insufficient Balance");
    	currentBalance=currentBalance-amount;
    }
    void login(int cardNo,int pin) throws InsufficientPinException {
    	if(cardNo==12345678) {
    		if(pin==2020)
    			System.out.println("Loggedin successfully...");
    		else
    			throw new InsufficientPinException("Incorrect PIN number");
    	}
    	else
    		System.out.println("Card is Experied...");
    }
}