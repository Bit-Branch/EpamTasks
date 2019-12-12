import entity.Team;
import service.FileReader;
import service.FilterClass;
import service.SortClass;
import service.TeamService;

public class App {
    public static void main(String[] args) {
        Team team1 = TeamService.createTeam(FileReader.readFile("src/main/resources/validEmployees.txt"));
        System.out.println(TeamService.countTeamCost(team1));
        SortClass.sortTeamByExperience(team1).outputAllEmployees();
        team1.outputAllEmployees();
        SortClass.sortTeamBySurnameAndSalary(team1);
        team1.outputAllEmployees();
        System.out.println(FilterClass.filterBySalary(team1));
    }
}