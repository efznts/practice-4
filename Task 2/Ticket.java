package task2;

import java.util.Objects;

public class Ticket {
    private int number;
    private String name;
    private double price;
    private String date;

    public Ticket(int number, String name, double price, String date) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public String getDescription() {
        return "Билет №" + number;
    }

    public double calculateFinalPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "номер=" + number + ", имя=" + name + ", цена=" + price + ", дата=" + date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket t = (Ticket) o;
        return number == t.number && price == t.price
                && name.equals(t.name) && date.equals(t.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, price, date);
    }
}
