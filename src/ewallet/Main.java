package ewallet;

public class Main {
    public static void main(String[] args) {
        // Creating users
        User alice = new User("Alice", 12345, 5000);
        User bob = new User("Bob", 67890, 2000);

        // Creating wallets
        PersonalWallet aliceWallet = new PersonalWallet(alice);
        BusinessWallet bobWallet = new BusinessWallet(bob);

        // Display initial balances
        System.out.println("=== Before Transfer ===");
        System.out.println(alice.name + " Balance: ₹" + aliceWallet.getBalance());
        System.out.println(bob.name + " Balance: ₹" + bobWallet.getBalance());

        // Transaction
        TransactionIMPL transaction = new TransactionIMPL();
        transaction.transferTo(alice, bob, 1000);

        // Display balances after transfer
        System.out.println("\n=== After Transfer ===");
        System.out.println(alice.name + " Balance: ₹" + aliceWallet.getBalance());
        System.out.println(bob.name + " Balance: ₹" + bobWallet.getBalance());

        // Trying to withdraw more than limit
        aliceWallet.withdraw(3500); // Will not work, exceeds 3000 limit
        bobWallet.withdraw(105000); // Will not work, exceeds 100000 limit

        // Display balances after withdrawals
        System.out.println("\n=== After Withdraw Attempts ===");
        System.out.println(alice.name + " Balance: ₹" + aliceWallet.getBalance());
        System.out.println(bob.name + " Balance: ₹" + bobWallet.getBalance());
    }
}