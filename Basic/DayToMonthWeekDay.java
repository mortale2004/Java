import java.util.Scanner;

public class DayToMonthWeekDay {
    public static void main(String []args)    
    {
        Scanner sc = new Scanner(System.in);

        int year, month, week, day;

        System.out.print("Enter Days = ");
        day = sc.nextInt();

        week = day / 7;
        month = day / 30;
        year = day / 365;

        System.out.println("Week" + (week>1 ? "s" : "")  + " = " + week);
        System.out.println("Month" + (month>1 ? "s" : "")  + " = " + month);
        System.out.println("Year" + (year>1 ? "s" : "")  + " = " + year);

        sc.close();
    }
}
