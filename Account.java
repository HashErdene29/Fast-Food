
public class Account {
	private double balance;
	private int accountNumber;
	
	public Account(double balance, int accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void deposit(double dep) {
		balance += dep;
	}
	
	public void withdraw(double wit) {
		if(wit > balance) {
			throw new ArithmeticException("Wait for deposit.");
		}
		else {
			balance -= wit;
		}
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}
}
