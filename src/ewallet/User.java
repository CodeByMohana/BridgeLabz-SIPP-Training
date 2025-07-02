package ewallet;

class User {
    String name;
    int accountNumber;
    private double balance;

    public User(String name, int accountNumber, double openingBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}