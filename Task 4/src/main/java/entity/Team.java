package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Team {
    private boolean hasManager;
    private List<Employee> team;

    public Team() {
        team = new ArrayList<>();
    }

    public Team(boolean hasManager, List<Employee> team) {
        this.hasManager = hasManager;
        this.team = team;
    }

    public boolean isHasManager() {
        return hasManager;
    }

    public void setHasManager(boolean hasManager) {
        this.hasManager = hasManager;
    }

    public List<Employee> getTeam() {
        return team;
    }

    public void setTeam(List<Employee> team) {
        this.team = team;
    }

    public void addEmployee(Employee employee){
        team.add(employee);
    }

    public void removeEmployee(Employee employee){
        team.remove(employee);
    }

    public void removeEmployee(int index){
        team.remove(index);
    }

    public void outputAllEmployees(){
        for (Employee employee:team
             ) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team1 = (Team) o;
        return hasManager == team1.hasManager &&
                Objects.equals(team, team1.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasManager, team);
    }
}