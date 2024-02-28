// https://www.codewars.com/kata/57e92e91b63b6cbac20001e5
public class HolidayVIII {

  public static int dutyFree(int normPrice, int discount, int hol) {
    double disc = normPrice * ((double) discount / 100);
    return (int) (hol / disc);
  }

}