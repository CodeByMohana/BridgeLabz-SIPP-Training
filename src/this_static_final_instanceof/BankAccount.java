package this_static_final_instanceof;

public class BankAccount {
	
    // Static variable shared across all instances
	static String bankName = "BOB Bank";
    private static int totalAccounts = 0;

    // Final instance variable (cannot be changed once set)
    private final String accountNumber;
    
    // Instance variable
    private String accountHolderName;
    
    // Constructor using 'this' to resolve naming ambiguity
    public BankAccount(String accountNumber, String accountName) {
    	this.accountNumber = accountNumber;
    	this.accountHolderName = accountName;
    	totalAccounts++;
    }
    
    // Static method to get total accounts
    private static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
    
 // Method to display account details using instanceOf
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("------------------------------");
        } else {
            System.out.println("Invalid account object.");
        }
    }
    
   // Main Method
    public static void main(String[] args) {
    	BankAccount acc1 = new BankAccount("123561", "Rohan"); 
    	BankAccount acc2 = new BankAccount("123562", "Rohit"); 
    	
    	acc1.displayDetails();
    	acc2.displayDetails();
    	
    	BankAccount.getTotalAccounts();

    }
    
    
    
}
