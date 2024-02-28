// https://www.codewars.com/kata/578a8a01e9fd1549e50001f1
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PeriodTime {
  public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
    long days = ChronoUnit.DAYS.between(last, today);
    return days > cycleLength;
  }
}