package ewallet;

abstract class Wallet {
    protected User user;

    public Wallet(User user) {
        this.user = user;
    }

    public double getBalance() {
        return user.getBalance();
    }

    public abstract void withdraw(double amount);
}