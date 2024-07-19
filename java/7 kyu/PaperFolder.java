// https://www.codewars.com/kata/58f0ba42e89aa6158400000e/
public class PaperFolder {
  public static Long fold(Double distance) {
    if (distance < 0)
      return null;

    Long count = 0l;
    double paperThickness = 0.0001;

    while (paperThickness < distance) {
      paperThickness *= 2;
      count++;
    }

    return count;
  }
}