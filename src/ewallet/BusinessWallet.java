package ewallet;

class BusinessWallet extends Wallet {

    public BusinessWallet(User user) {
        super(user);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 100000 && user.getBalance() >= amount) {
            user.withdraw(amount);
        }
    }
}
