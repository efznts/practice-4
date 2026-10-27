package task2;

import java.util.Objects;

// итоговая цена = цена + 50 за каждый кг багажа
public class AirTicket extends Ticket {
    private String flight;
    private int baggageKg;

    public AirTicket(int number, String name, double price, String date, String flight, int baggageKg) {
        super(number, name, price, date);
        this.flight = flight;
        this.baggageKg = baggageKg;
    }

    @Override
    public String getDescription() {
        return "Авиабилет №" + getNumber() + ", рейс " + flight;
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() + baggageKg * 50;
    }

    @Override
    public String toString() {
        return "Самолёт: " + super.toString() + ", рейс=" + flight + ", багаж=" + baggageKg + " кг";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        AirTicket t = (AirTicket) o;
        return baggageKg == t.baggageKg && flight.equals(t.flight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flight, baggageKg);
    }
}
