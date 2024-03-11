// https://www.codewars.com/kata/5a6d3bd238f80014a2000187
public class CatYearDogYear2 {

  public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
    int catHumanYears = catYears < 15 ? 0 : catYears - 15 < 9 ? 1 : 2 + (catYears - 24) / 4;
    int dogHumanYears = dogYears < 15 ? 0 : dogYears - 15 < 9 ? 1 : 2 + (dogYears - 24) / 5;

    return new int[] { catHumanYears, dogHumanYears };
  }

}