// https://www.codewars.com/kata/562f91ff6a8b77dfe900006e/train/java
public class Movie {

  public static int movie(int card, int ticket, double perc) {
    int a = 0;
    double b = card;
    int i = 1;

    while (Math.ceil(b) >= a) {
      b += ticket * Math.pow(perc, i);
      a += ticket;
      i++;
    }

    return --i;
  }
}