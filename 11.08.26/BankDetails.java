package Encapsulation;

public class BankDetails {
	public static void main(String[] args) {
		bank b=new bank(101, "Pon Sutharshini", 97543792, 18,"Female","25.09.25","SREC COLLEGE", "Saving Account", 19374674, 500);
		b.display();
		b.deposit(5000);
		b.withdraw(500);
	}
}
