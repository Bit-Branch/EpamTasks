package service;

import entity.Employee;
import entity.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterClass {

    public static List<Employee> filterBySalary(Team team) {
        Scanner sc = new Scanner(System.in);
        List<Employee> filterResults = new ArrayList<>();
        double min;
        double max;
        System.out.println("Enter minimum range limit");
        min = sc.nextDouble();
        System.out.println("Enter maximum range limit");
        max = sc.nextDouble();
        for (Employee employee : team.getTeam()) {
            if ((employee.getSalary() >= min) && (employee.getSalary() < max)) {
                filterResults.add(employee);
            }
        }
        return filterResults;
    }

}
