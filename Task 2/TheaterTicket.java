package task2;

import java.util.Objects;

// итоговая цена: ряды 1-5 дороже в 1.5 раза
public class TheaterTicket extends Ticket {
    private String show;
    private int row;

    public TheaterTicket(int number, String name, double price, String date, String show, int row) {
        super(number, name, price, date);
        this.show = show;
        this.row = row;
    }

    @Override
    public String getDescription() {
        return "Билет в театр №" + getNumber() + ", спектакль \"" + show + "\", ряд " + row;
    }

    @Override
    public double calculateFinalPrice() {
        if (row <= 5) {
            return getPrice() * 1.5;
        }
        return getPrice();
    }

    @Override
    public String toString() {
        return "Театр: " + super.toString() + ", спектакль=" + show + ", ряд=" + row;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        TheaterTicket t = (TheaterTicket) o;
        return row == t.row && show.equals(t.show);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), show, row);
    }
}
