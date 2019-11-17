package Ex2_4;

public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private boolean isYearMultiple(int divider){
        boolean isMultiple = (year % divider == 0);
        return isMultiple;
    }

    public boolean isYearLeap(){
        boolean isLeap = false;
        if ((isYearMultiple(4) && !isYearMultiple(100)) || isYearMultiple(400)){
                    isLeap = true;
                }
        return isLeap;
    }
}
