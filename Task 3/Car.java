package task3;

import java.util.Objects;

// Машина с пассажирами: к массе добавляется по 70 кг на каждого пассажира
public class Car extends Body {
    private int passengers;

    public Car(String name, double mass, double speed, int passengers) {
        super(name, mass, speed);
        if (passengers < 0) {
            throw new IllegalArgumentException("Пассажиров не может быть меньше 0");
        }
        this.passengers = passengers;
    }

    @Override
    public double energy() {
        double totalMass = getMass() + passengers * 70;
        return totalMass * getSpeed() * getSpeed() / 2;
    }

    @Override
    public String toString() {
        return "Машина " + super.toString() + ", пассажиров=" + passengers;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Car c = (Car) o;
        return passengers == c.passengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengers);
    }
}
