package Theory.Enam;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Day day = Day.SATURDAY;
        showDay(day);
        Day day1 = Day.MONDAY;
        showDay(day1);

        switch (day) {
            case MONDAY:
                System.out.println("It is MONDAY");
            break;
            case TUESDAY:
                System.out.println("It is TUESDAY");
            break;
            case WEDNESDAY:
                System.out.println("It is WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("It is THURSDAY");
                break;
            case FRIDAY:
    //            System.out.println("It is FRIDAY");
    //            break;
            case SATURDAY:
                System.out.println("It is SATURDAY or FRIDAY");
                break;
            case SUNDAY:
                System.out.println("It is SUNDAY");
                break;
        }

        System.out.println(day.ordinal());
       Day da3 = day.valueOf("WEDNESDAY");
        System.out.println(da3);
        Day[] days = Day.values();
        System.out.println(Arrays.toString(days));
        for (Day d: days) {
            System.out.println(d);
        }

    }
    public static void showDay(Day day) {
        if (day.ordinal() < 5) {
            System.out.println("Today is workday");
        } else {
            System.out.println("Today is holiday");
        }
    }
}
