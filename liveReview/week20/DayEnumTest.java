package week20;

import java.util.Arrays;

public class DayEnumTest {

    Day day;

    public DayEnumTest(Day day){
        this.day = day;
    }

    public void tellItLikeItIs(){
        switch (day){
            case MONDAY:
                System.out.println("Mondays are not my Day");
                break;
            case FRIDAY:
                System.out.println("Best day ever, week is over");
                break;
            case SATURDAY:
                System.out.println("Oscar day, join the review");
                break;
            case SUNDAY:
                System.out.println("Family day, rest little bit");
                break;
            default:
                System.out.println("MeedWeeks are any ordinary day");
                break;
        }
    }

    public static void main(String[] args) {

        DayEnumTest firstDay = new DayEnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();

        DayEnumTest secondDay = new DayEnumTest(Day.SATURDAY);
        secondDay.tellItLikeItIs();

        DayEnumTest thirdDay = new DayEnumTest(Day.SUNDAY);
        thirdDay.tellItLikeItIs();





    }

}
