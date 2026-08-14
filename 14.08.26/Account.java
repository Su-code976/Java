package bankentity;

public class Account {
	private long accNo;
	private String userName;
	private String accType;
	private double balance;
	public Account(long accNo, String userName, String accType, double balance) {
		this.accNo = accNo;
		this.userName = userName;
		this.accType = accType;
		this.balance = balance;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", userName=" + userName + ", accType=" + accType + ", balance=" + balance
				+ "]";
	}
	

}
