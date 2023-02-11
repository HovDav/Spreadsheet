public class Date {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year < 0 || year > 5000){
            System.out.println("bad format for year");
        } else {
            this.year = year;
        }
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
