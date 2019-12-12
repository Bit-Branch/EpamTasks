package entity;

import java.util.Objects;

public class Developer extends Employee{
    private Position position;

    public Developer() {
    }

    public Developer(String surname, String name, double workedHours,
                     double salary, double experience, Position position) {
        super(surname, name, workedHours, salary, experience);
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + " " + position + " Developer\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return position == developer.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), position);
    }
}
