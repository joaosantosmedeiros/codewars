// https://www.codewars.com/kata/5803956ddb07c5c74200144e/train/java
public class AgeRangeCompability{
  public static String datingRange(int age) {
    int min = (int) Math.floor(age/2 + 7);
    int max = (int) Math.floor((age - 7) * 2);

    if(age <= 14){
      min = (int) Math.floor(age - 0.10 * age);
      max = (int) Math.floor(age + 0.10 * age);
    }

    return min + "-" + max;
  }
}