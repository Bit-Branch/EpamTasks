import entity.*;
import service.FileReader;
import service.FilterClass;
import service.SortClass;
import service.TeamService;

import static org.junit.Assert.*;

public class Tester {
    public static void main(String[] args) {
        Team team1 = TeamService.createTeam(FileReader.readFile("src/main/resources/validEmployees.txt"));
        assertNotNull(team1);
        Team team2 = TeamService.createTeam(FileReader.readFile("src/main/resources/invalidEmployees.txt"));
        Team expected = new Team();
        expected.addEmployee(new Developer("Pru","Elizabeth",6,500,1,Position.JUNIOR));
        expected.addEmployee(new Developer("Compthon","Erick",8,1400,3, Position.MIDDLE));
        expected.addEmployee(new Manager("Langdon","Braylen",8,2100,3,true));
        expected.addEmployee(new entity.Tester("Irwin","Patrick",8,1300,3, TypeQA.AUTOMATED));
        expected.addEmployee(new Developer("Tawnie","Elise",8,2300,5,Position.SENIOR));

        assertEquals(798,TeamService.countTeamCost(team1),0.001);
        assertEquals(true,expected.equals(SortClass.sortTeamByExperience(team1)));

        SortClass.sortTeamBySurnameAndSalary(team1);
        team1.outputAllEmployees();
        System.out.println(FilterClass.filterBySalary(team1));
    }
}
