// https://www.codewars.com/kata/57faf7275c991027af000679
public class ExclamationMarks6 {

  public static String remove(String s, int n) {
    StringBuilder sb = new StringBuilder(s);
    int counter = 0;

    while (counter < n) {
      int index = sb.indexOf("!");
      if (index >= 0) {
        sb.replace(index, index + 1, "");
        counter++;
      } else {
        break;
      }
    }

    return sb.toString();
  }

}