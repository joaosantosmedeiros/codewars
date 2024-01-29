// https://www.codewars.com/kata/62c93765cef6f10030dfa92b/train/java
public class CatsAndShelves {
  public static int solution(int start, int finish) {
    int count = 0;

    while (start < finish) {
      if (finish - start >= 3) {
        start += 3;
      } else if (finish - start >= 1) {
        start += 1;
      }
      count++;
    }
    return count;
  }
}