package service;

import factory.*;
import entity.Employee;
import entity.Team;

import java.util.List;

public class TeamService {
    private static final int MONTH_WORKDAYS = 21;

    public static double countTeamCost(Team team) {
        double cost = 0.0;
        List<Employee> employeeList = team.getTeam();
        for (Employee employee:employeeList
        ) {
            cost += employee.getWorkedHours();
        }
        return cost*MONTH_WORKDAYS;
    }

    public static Team createTeam(List<String> employees){
        Team team = new Team();

        for (String str:employees
             ) {
            team.addEmployee(EmployeeFactory.getEmployee(str));
        }
        return team;
    }
}
