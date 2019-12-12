package entity;

import java.util.Objects;

public class Tester extends Employee{
    private TypeQA typeQA;

    public Tester() {
    }

    public Tester(String surname, String name, double workedHours, double salary, double experience, TypeQA typeQA) {
        super(surname, name, workedHours, salary, experience);
        this.typeQA = typeQA;
    }

    public TypeQA getTypeQA() {
        return typeQA;
    }

    public void setTypeQA(TypeQA typeQA) {
        this.typeQA = typeQA;
    }

    @Override
    public String toString() {
        return super.toString() + " " + typeQA + " Tester\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tester tester = (Tester) o;
        return typeQA == tester.typeQA;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeQA);
    }
}
