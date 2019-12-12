package entity;

import java.util.Objects;

public class Employee {
    private String surname;
    private String name;
    private double workedHours;
    private double salary;
    private double experience;

    public Employee() {
    }

    public Employee(String surname, String name, double workedHours,
                    double salary, double experience) {
        this.surname = surname;
        this.name = name;
        this.workedHours = workedHours;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return surname +
                " " + name +
                " " + salary +
                " " + experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.workedHours, workedHours) == 0 &&
                Double.compare(employee.salary, salary) == 0 &&
                Double.compare(employee.experience, experience) == 0 &&
                Objects.equals(surname, employee.surname) &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, workedHours, salary, experience);
    }
}