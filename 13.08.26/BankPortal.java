package bank_app;
import java.util.*;
public class BankPortal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:\n1.Search Account \n2.Cash Withdraw\n3.Login");
		int n=sc.nextInt();
		BankService b=new BankService();
		switch(n) {
		case 1:
			try {
			System.out.println("Type Your Account Number");
			int accNo=sc.nextInt();
			b.searchAccount(accNo);
			}
			catch(AccountNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			try {
				System.out.println("Enter the Amount:");
				int am=sc.nextInt();
				b.withdrawl(am);
			}
			catch(InsufficientBalanceException e){
				System.out.println(e.getMessage());
			}
			catch(InvalidAmountException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			try {
				System.out.println("Enter Your cardNo:");
				int c=sc.nextInt();
				System.out.println("Enter your PIN:");
				int p=sc.nextInt();
				b.login(c, p);
			}
			catch(InsufficientPinException e) {
				System.out.println(e.getMessage());
			}
			break;
		default:
			System.out.println("Invalid Choice..");
			break;
			}
		
	}

}
