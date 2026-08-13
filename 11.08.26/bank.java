package Encapsulation;

public class bank {
    private int accountNo;
    private String name;
	private long mobileNo;
	private int age;
	private String gender;
	private String dob;
	private String address;
	private String accountType;
	private long IFSC;
	private double balance;
    public bank(int accountNo, String name, long mobileNo, int age, String gender, String dob, String address,
			String accountType, long IFSC, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.accountType = accountType;
		this.IFSC = IFSC;
		this.balance = balance;
	}
	void deposit(double amount) {
        balance=balance+amount;
        System.out.println("Deposited:"+amount);
    }
    void withdraw(double amount) {
        balance=balance-amount;
        System.out.println("Withdrawn:"+amount);
    }
    void display() {
        System.out.println("Account Number:"+accountNo+"\nName: " + name+"\nMobile:"+mobileNo+"\nAge:"+age+"\nGender:"+gender+"\nDate of Brith:"+dob+"\nAddress"+address+"\nAccount Type:"+accountType+"\nIFSC:"+IFSC+"\nBalance:"+balance);
    }
}