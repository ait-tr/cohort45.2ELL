import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate newDate = localDate.plusWeeks(1);
        newDate = newDate.withYear(-40_000_000);
        System.out.println(newDate);

        newDate = newDate.withDayOfYear(250);
        System.out.println(newDate);

        DayOfWeek day = newDate.getDayOfWeek();
        System.out.println(day);

        LocalDate localDate1 = LocalDate.of(2001, 4, 24);
        LocalDate localDate2 = LocalDate.now();

        List<LocalDate> list = localDate1.datesUntil(localDate2).toList();

        LocalDateTime localDateTime1 = localDate.atTime(localTime);

        System.out.println(localDateTime1);
        System.out.println(list);

        boolean leap = localDate.isLeapYear();
        System.out.println(leap);

        System.out.println(localDate.isAfter(newDate));

        System.out.println(localDate.getMonthValue());
    }
}
