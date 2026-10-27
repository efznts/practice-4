package task3;

import java.util.Objects;

// Тело, которое движется. Кинетическая энергия E = m * v * v / 2
public class Body {
    private String name;
    private double mass;
    private double speed;

    public Body(String name, double mass, double speed) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Название не указано");
        }
        if (mass <= 0) {
            throw new IllegalArgumentException("Масса должна быть больше 0");
        }
        if (speed < 0) {
            throw new IllegalArgumentException("Скорость не может быть отрицательной");
        }
        this.name = name;
        this.mass = mass;
        this.speed = speed;
    }

    public double energy() {
        return mass * speed * speed / 2;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return name + ": масса=" + mass + " кг, скорость=" + speed + " м/с";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Body b = (Body) o;
        return mass == b.mass && speed == b.speed && name.equals(b.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mass, speed);
    }
}
