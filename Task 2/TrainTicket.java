package task2;

import java.util.Objects;

// итоговая цена = цена + 150 за постельное бельё (если взято)
public class TrainTicket extends Ticket {
    private int wagon;
    private boolean bedLinen;

    public TrainTicket(int number, String name, double price, String date, int wagon, boolean bedLinen) {
        super(number, name, price, date);
        this.wagon = wagon;
        this.bedLinen = bedLinen;
    }

    @Override
    public String getDescription() {
        return "Билет на поезд №" + getNumber() + ", вагон " + wagon;
    }

    @Override
    public double calculateFinalPrice() {
        if (bedLinen) {
            return getPrice() + 150;
        }
        return getPrice();
    }

    @Override
    public String toString() {
        return "Поезд: " + super.toString() + ", вагон=" + wagon + ", бельё=" + bedLinen;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        TrainTicket t = (TrainTicket) o;
        return wagon == t.wagon && bedLinen == t.bedLinen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wagon, bedLinen);
    }
}
