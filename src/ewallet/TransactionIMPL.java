package ewallet;

class TransactionIMPL implements ITransaction {

    @Override
    public void transferTo(User sender, User receiver, double amount) {
        if (sender.getBalance() >= amount && amount > 0) {
            sender.withdraw(amount);
            receiver.deposit(amount);
        }
    }
}

