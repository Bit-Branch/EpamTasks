package service;

import entity.Employee;
import entity.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SortClass {

    public static Team sortTeamByExperience(Team team) {
        Team sortedTeam = new Team();
        sortedTeam.setTeam(new ArrayList<>(team.getTeam()));
        Collections.sort(sortedTeam.getTeam(), Comparator.comparing(Employee::getExperience));
        return sortedTeam;
    }

    public static Team sortTeamBySurnameAndSalary(Team team) {
        Team sortedTeam = new Team();
        sortedTeam.setTeam(new ArrayList<>(team.getTeam()));
        Collections.sort(sortedTeam.getTeam(), Comparator.comparing(Employee::getSurname)
                .thenComparing(Employee::getSalary));
        return sortedTeam;
    }
}
