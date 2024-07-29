import java.util.Arrays;

public class SpecialNumber5{
  public static String specialNumber(int number){
    long count = Arrays.stream(String.valueOf(number).split("")).filter(digit -> Integer.parseInt(digit) > 5).count();
    return count > 0 ? "NOT!!" : "Special!!";
  }
}