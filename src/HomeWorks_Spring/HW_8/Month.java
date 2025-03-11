package HomeWorks_Spring.HW_8;


 public final class Month {

    private String monthName;
    private int days;
    private int weekDays;


    public Month (String monthName, int days, int weekDays) {
        this.monthName = monthName;
        this.days = days;
        this.weekDays = weekDays;
    }
    public String getMonthName() {
         return monthName;
     }
    public int getDays(){
         return days;
    }
    public int getWeekDays() {
         return weekDays;
    }

 }

