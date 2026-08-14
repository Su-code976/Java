package bankapp;
import java.util.Scanner;
import bankentity.Account;
import bankservice.AccountService;
import bankservice.AccountServiceImpl;
public class BankPortal {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountService a1 = new AccountServiceImpl();
        System.out.println("1.Display Accounts\n2.Search Account\n3.Add Account\n4.Deposit\n5.Withdraw\n6.Balance\n7.Delete Account");
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
            System.out.println(a1.getAllAccounts());
            break;
        case 2:
            System.out.println("Enter Account Number:");
            long n = sc.nextLong();
            a1.searchAccount(n);
            break;
        case 3:
            System.out.println("Enter Account Number:");
            long accNo = sc.nextLong();
            System.out.println("Enter Account Holder Name:");
            String name = sc.next();
            System.out.println( "Enter Account Type:");
            String type = sc.next();
            System.out.println("Enter Balance:");
            double balance = sc.nextDouble();
            Account newAccount =new Account(accNo, name, type, balance);
            a1.addAccount(newAccount);
            break;
        case 4:
            System.out.println("Enter Account Number:");
            long dac = sc.nextLong();
            System.out.println("Enter Amount:");
            double da = sc.nextDouble();
            a1.deposit(dac,da);
            break;
        case 5:
            System.out.println("Enter Account Number:");
            long wac=sc.nextLong();
            System.out.println("Enter Amount:");
            double wa= sc.nextDouble();
            a1.withdraw(wac,wa);
            break;
        case 6:
            System.out.println("Enter Account Number:");
            long b=sc.nextLong();
            a1.balance(b);
            break;
        case 7:
            System.out.println("Enter Account Number:");
            long d= sc.nextLong();
            a1.deleteAccount(d);
            break;
        default:
            System.out.println("Invalid Choice");
            break;
        }
    }
}
