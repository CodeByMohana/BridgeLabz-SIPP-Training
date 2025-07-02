package ewallet;

class PersonalWallet extends Wallet {

    public PersonalWallet(User user) {
        super(user);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 3000 && user.getBalance() >= amount) {
            user.withdraw(amount);
        }
    }
}