package factory;
import entity.*;

public class EmployeeFactory{

    public static Employee getEmployee(String str){
        try {
            String[] elements = str.split(" ");
            String surname = elements[0];
            String name = elements[1];
            double workedHours = Double.valueOf(elements[2]);
            double salary = Double.valueOf(elements[3]);
            double experience = Double.valueOf(elements[4]);
            EmployeeType employeeType = EmployeeType.fromString(elements[elements.length - 1]);

            switch (employeeType) {
                case TESTER: {
                    return new Tester(surname, name, workedHours, salary, experience, TypeQA.fromString(elements[5]));
                }
                case MANAGER: {
                    return new Manager(surname, name, workedHours, salary, experience, Boolean.valueOf(elements[5]));
                }
                case DEVELOPER: {
                    return new Developer(surname, name, workedHours, salary, experience, Position.valueOf(elements[5]));
                }
            }
        }catch (Exception e){
            System.out.println("The file contained incorrect information");
        }
        return null;
    }
}
