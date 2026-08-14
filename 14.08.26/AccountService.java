package bankservice;
import java.util.List;
import bankentity.Account;
public interface AccountService {
	List<Account> getAllAccounts();
	void searchAccount(long accNo);
	void addAccount(Account newAccount);
	void deposit(long accNo,double amount);
	void withdraw(long accNo,double amount);
	void balance(long accNo);
	void deleteAccount(long accNo);
}
