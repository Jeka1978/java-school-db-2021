package date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
//        LocalDate date;
//        LocalTime time;
//        LocalDateTime
//        Duration
//        ChronoUnit

//       LocalDate.of()
        LocalDate now = LocalDate.now();

        LocalDate yesterday = now.minusDays(1);
        LocalDate date = yesterday.withYear(1900);


        LocalDate asgar = LocalDate.of(1999, 1, 9);


        LocalDate jeka = LocalDate.of(1978, 10, 3);

        long between = ChronoUnit.YEARS.between(jeka, asgar);
        System.out.println("between = " + between);

        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINA));
        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRANCE));
        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.FRANCE));


    }
}
