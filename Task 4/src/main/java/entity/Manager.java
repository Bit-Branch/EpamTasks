package entity;

import java.util.Objects;

public class Manager extends Employee {
    private boolean hasProject = false;

    public Manager() {
    }

    public Manager(String surname, String name, double workedHours,
                   double salary, double experience, boolean hasProject) {
        super(surname, name, workedHours, salary, experience);
        this.hasProject = hasProject;
    }

    public boolean isHasProject() {
        return hasProject;
    }

    public void setHasProject(boolean hasProject) {
        this.hasProject = hasProject;
    }

    @Override
    public String toString() {
        return super.toString() + " " + hasProject + " Manager\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return hasProject == manager.hasProject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasProject);
    }
}
