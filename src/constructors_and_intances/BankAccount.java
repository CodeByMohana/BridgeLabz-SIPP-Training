package constructors_and_intances;

public class BankAccount {
	public String accountNumber;       // Public: accessible everywhere
    protected String accountHolder;    // Protected: accessible within package and by subclasses
    private double balance;
    
    public BankAccount(String accountNumber, String accountHolder, double balance) {
    	this.accountHolder = accountHolder;
    	this.accountNumber = accountNumber;
    	this.balance = balance;
    }
    
    //Getter
    public double getBalance() {
    	return balance;
    }
    
    //Setter
    public void setBalance(double balance) {
    	this.balance = balance;
    }

    //Public method to deposit
    public void deposit(double amount) {
    	if(amount > 0) {
    		balance += amount;
    	}
    }
    
    //Public method to withdraw
    public void withdraw(double amount) {
    	if(amount > 0 && amount <= balance) {
    		balance -= amount;
    	}
    }
}

class SavingsAccount extends BankAccount {
	public SavingsAccount(String accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
	}
	
	// Method to display account info (demonstrating access to public and protected members)
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);    // Accessible: public
        System.out.println("Account Holder: " + accountHolder);    // Accessible: protected
        System.out.println("Balance: " + getBalance());            // Accessed via public getter
    }
}
