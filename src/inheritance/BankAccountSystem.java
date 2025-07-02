package inheritance;

class BankAccount {
	int accountNumber;
	double balance;

	// Constructor
	public BankAccount(int accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
}

class SavingsAccount extends BankAccount {
	double interestRate;

	public SavingsAccount(int accountNumber, double initialBalance, double interestRate) {
		super(accountNumber, initialBalance);
		this.interestRate = interestRate;
	}

	public void applyInterest() {
		balance += balance * interestRate / 100;
	}

	public void displayInfo() {
		System.out.println("Savings Account Number: " + accountNumber);
		System.out.println("Balance: ₹" + balance);
		System.out.println("Interest Rate: " + interestRate + "%");
		System.out.println();
	}
}

class CheckingAccount extends BankAccount {
	double withdrawlLimit;

	public CheckingAccount(int accountNumber, double initialBalance, double withdrawLimit) {
		super(accountNumber, initialBalance);
		this.withdrawlLimit = withdrawLimit;
	}

	public void withdraw(double amount) {
		if (amount <= withdrawlLimit && amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Withdrawal exceeds limit or insufficient balance.");
		}
	}

	public void displayInfo() {
		System.out.println("Checking Account Number: " + accountNumber);
		System.out.println("Balance: ₹" + balance);
		System.out.println("Withdrawl Limit: ₹" + withdrawlLimit);
		System.out.println();
	}
}

class FixedDepositAccount extends BankAccount {
	double depositAmount;
	int maturityPeriod; // in months

	public FixedDepositAccount(int accountNumber, double initialBalance, double depositAmount, int maturityPeriod) {
		super(accountNumber, initialBalance);
		this.depositAmount = depositAmount;
		this.maturityPeriod = maturityPeriod;
	}

	public void displayInfo() {
		System.out.println("Fixed Deposit Account Number: " + accountNumber);
		System.out.println("Balance: ₹" + balance);
		System.out.println("Deposit Amount: ₹" + depositAmount);
		System.out.println("Maturity Period: " + maturityPeriod + " months");
		System.out.println();
	}
}

public class BankAccountSystem {
	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount(101, 5000, 4.5);
		savings.applyInterest();
		savings.displayInfo();

		CheckingAccount checking = new CheckingAccount(102, 3000, 1000);
		checking.withdraw(3500);
		checking.displayInfo();

		FixedDepositAccount fixedDeposit = new FixedDepositAccount(103, 10000, 20000, 12);
		fixedDeposit.displayInfo();
	}
}