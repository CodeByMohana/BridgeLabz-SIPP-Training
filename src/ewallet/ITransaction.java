package ewallet;

interface ITransaction {
    void transferTo(User sender, User receiver, double amount);
}
