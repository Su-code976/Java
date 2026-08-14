package bankservice;
import java.util.ArrayList;
import java.util.List;
import bankentity.Account;
public class AccountServiceImpl implements AccountService{
	List<Account> a=new ArrayList<Account>(
			List.of(new Account(1009,"Sutharshini","Saving",35000.00),
					new Account(1006,"Anu","Saving",5000.00),
					new Account(1209,"Priya","Current",30000.00))
			);
	@Override
	public List<Account> getAllAccounts() {
		return a;
	}

	@Override
	public void searchAccount(long accNo) {
		for(Account account:a) {
			if(account.getAccNo()==accNo) {
				System.out.println(account);
				return;
			}
		}
		System.out.println("Account Not Found");
		
	}

	@Override
	public void addAccount(Account newAccount) {
		a.add(newAccount);
		System.out.println("Account added");
	}

	@Override
	public void deposit(long accNo, double amount) {
		for(Account account :a) {
			if(account.getAccNo()==accNo) {
				account.setBalance(account.getBalance()+amount);
				System.out.println("Amount Deposited");
				System.out.println("Balance:"+account.getBalance());
				return;
			}
		}
		System.out.println("Account Not Found");
		
	}

	@Override
	public void withdraw(long accNo, double amount) {
		for(Account account:a) {
			if(account.getAccNo()==accNo) {
				if(amount<=account.getBalance()) {
					account.setBalance(account.getBalance()-amount);
					System.out.println("Amount Withdrawn");
					System.out.println("Balance:"+account.getBalance());
				}
				else {
					System.out.println("Insuifficient Balance");
				}
				return;
			}
		}
		System.out.println("Account Not Found");
	}

	@Override
	public void balance(long accNo) {
		for(Account account :a) {
			if(account.getAccNo()==accNo) {
				System.out.println("Balance:"+account.getBalance());
				return;
			}
		}
		
	}

	@Override
	public void deleteAccount(long accNo) {
		for(Account account:a) {
			if(account.getAccNo()==accNo) {
				a.remove(account);
				System.out.println("Account Deleted");
				return;
			}
		}
		System.out.println("Account Not Found");
		
	}

}
