// https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b
public class DogYearsCatYears {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    int dogYears = 15 + Math.max(((humanYears - (humanYears - 1)) * 9), 0) + Math.max(((humanYears - 2) * 5), 0);
    int catYears = 15 + Math.max(((humanYears - (humanYears - 1)) * 9), 0) + Math.max(((humanYears - 2) * 4), 0);

    return humanYears > 1 ? new int[] { humanYears, catYears, dogYears } : new int[] { 1, 15, 15 };
  }

}