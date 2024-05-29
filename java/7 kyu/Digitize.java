// https://www.codewars.com/kata/5417423f9e2e6c2f040002ae

import java.util.Arrays;

public class Digitize{
  public static int[] digitize(int n){
    return Arrays.stream((n + "").split("")).mapToInt(i -> Integer.parseInt(i)).toArray();
  }
}