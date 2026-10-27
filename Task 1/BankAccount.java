package task1;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("Владелец не указан");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        }
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть больше 0");
        }
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть больше 0");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Недостаточно средств");
        }
        balance = balance - amount;
    }

    public String getInfo() {
        return "Владелец: " + owner + ", баланс: " + balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}
