// https://www.codewars.com/kata/5761a717780f8950ce001473
public class AgeDiff {
  public static String CalculateAge(int birth, int yearTo) {
    int diff = yearTo - birth;
    String year = Math.abs(diff) == 1.0 ? "year" : "years";

    return diff < 0 ? ("You will be born in " + (int) Math.abs(diff) + " " + year + ".")
        : diff > 0 ? ("You are " + diff + " " + year + " old.") : "You were born this very year!";
  }
}