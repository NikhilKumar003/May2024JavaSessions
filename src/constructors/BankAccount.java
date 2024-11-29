package constructors;

public class BankAccount {

	String account;
	double balance;
	static double total=0;
	
	public BankAccount(String account, double balance) {
		super();
		this.account = account;
		this.balance = balance;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static double deposit(double balance ) {
//		double totalBalance = 0;
		total= total+ balance;
		return balance;
	}
	
	public static double withDraw(double balance ) {
//		double totalBalance = 0;
		total= total- balance;
		return balance;
	}


	public static void main(String[] args) {
		
		BankAccount.deposit(3000);
		System.out.println("After Deposit :"+ BankAccount.total);
		BankAccount.withDraw(2000);
		System.out.println("After withdrawal :"+ total);
		
		
	}

}
