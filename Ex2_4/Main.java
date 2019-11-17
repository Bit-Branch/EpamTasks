package Ex2_4;

import java.util.Scanner;

public class Main {
    private static Date date;

    private static void enterDate(){
        date = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        date.setYear(scanner.nextInt());
        System.out.println("Enter month: ");
        date.setMonth(scanner.nextInt());
        System.out.println("Enter day: ");
        date.setDay(scanner.nextInt());
    }

    private static int getDaysInMonth(int month)
    {
        int [] months = {4,6,9,11};
        if (month == 2)
        {
            if (date.isYearLeap()) return 29;
            return 28;
        }
        for (int i : months)
        {
            if (month == i) return 30;
        }
        return 31;
    }

    private static Date determineNextDate(){
        Date nextDate = new Date();
        int currDay = date.getDay();
        int currMonth = date.getMonth();
        int currYear = date.getYear();

        if (++currDay > getDaysInMonth(currMonth))
        {
            currDay = 1;
            if (++currMonth > 12)
            {
                currMonth = 1;
                currYear++;
            }
        }
        nextDate.setDay(currDay);
        nextDate.setMonth(currMonth);
        nextDate.setYear(currYear);
        return nextDate;
    }

    private static void outputNextDate(){
        Date newDate = determineNextDate();
        System.out.println("Next date is:");
        System.out.println(newDate.getDay() + "." + newDate.getMonth() + "."
                + newDate.getYear());
    }

    public static void main(String[] args) {
        enterDate();
        determineNextDate();
        outputNextDate();
    }
}
