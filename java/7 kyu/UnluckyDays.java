// https://www.codewars.com/kata/56eb0be52caf798c630013c0
import java.time.DayOfWeek;
import java.time.LocalDate;

public class UnluckyDays {
  public static int unluckyDays(int year) {
    LocalDate date = LocalDate.of(year, 1, 1);

    int acc = 0;
    while(date.getYear() == year){
      if(date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY) acc ++;
      date = date.plusDays(1);
    } 

    return acc;
  }
}