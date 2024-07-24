import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Класс MeetingMain является точкой входа в приложение для работы с встречами.
 * Он создает список встреч, отображает их, а также производит вычисления, такие как
 * общая продолжительность встреч и среднее время встреч и выводит их.
 */
public class MeetingMain {

    public static void main(String[] args) {

        List<Meeting> meetings = new ArrayList<>();
        meetings.add(new Meeting("Iwan", "Maria",
                LocalDateTime.of(2024, 8, 15, 14, 5)));
        meetings.add(new Meeting("Ruslan", "Ludmila",
                LocalDateTime.of(2024, 11, 7, 18, 50)));
        meetings.add(new Meeting("Alexey", "Swetlana",
                LocalDateTime.of(2024, 9, 13, 16, 10)));
        meetings.add(new Meeting("Dmitry", "Olga",
                LocalDateTime.of(2024, 7, 24, 15, 50)));
        meetings.add(new Meeting("Viktor", "Natalia",
                LocalDateTime.of(2024, 10, 30, 17, 40)));

        System.out.println("\nВсе встречи из списка:");
        meetings.forEach(System.out::println);

        List<Long> epochMilliList = new ArrayList<>();
        for (Meeting meeting : meetings) {
            long epochMilli = meeting.getStartDateTime().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            epochMilliList.add(epochMilli);
        }

        System.out.println("\nСписок всех встреч в миллисекундах с начала эпохи:");
        epochMilliList.forEach(System.out::println);

        Optional<Long> optional = epochMilliList.stream()
                .reduce((firstValue, secondValue) -> firstValue + secondValue);
        long totalEpochMillis = optional.orElse(0L);
        System.out.println("\nОбщая сумма всех встреч в миллисекундах:  " + totalEpochMillis);

        try {
            long averageMillis = totalEpochMillis / epochMilliList.size();
            System.out.println("Среднее время встреч в миллисекундах:     " + averageMillis);

            Instant instant = Instant.ofEpochMilli(averageMillis);

            ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());

            LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();

            LocalDate localDate = localDateTime.toLocalDate();
            LocalTime localTime = localDateTime.toLocalTime();

            System.out.println("\nСреднее время встреч:");
            System.out.println("Дата:   " + localDate);
            System.out.println("Время:  " + localTime);

        }catch (ArithmeticException e) {
            System.out.println("Список встреч пуст!");
        }
    }
}
