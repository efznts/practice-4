package task3;

import java.util.Objects;

// Катящийся шар: кроме движения он ещё вращается,
// поэтому энергия больше: E = 0.7 * m * v * v
public class Ball extends Body {
    private double radius;

    public Ball(String name, double mass, double speed, double radius) {
        super(name, mass, speed);
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть больше 0");
        }
        this.radius = radius;
    }

    @Override
    public double energy() {
        return 0.7 * getMass() * getSpeed() * getSpeed();
    }

    @Override
    public String toString() {
        return "Шар " + super.toString() + ", радиус=" + radius + " м";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Ball b = (Ball) o;
        return radius == b.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
