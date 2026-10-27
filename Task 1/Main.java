package task1;

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Иван", 1000);
        BankAccount b = new BankAccount("Мария", 500);

        System.out.println(a.getInfo());
        System.out.println(b.getInfo());

        a.deposit(250);
        System.out.println("Иван пополнил на 250: " + a.getInfo());

        b.withdraw(200);
        System.out.println("Мария сняла 200: " + b.getInfo());

        try {
            b.withdraw(1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            a.deposit(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            new BankAccount("", 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
