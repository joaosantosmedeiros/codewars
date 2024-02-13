// https://www.codewars.com/kata/576b93db1129fcf2200001e6
public class SumWithoutHighestAndLowest {
  public static int sum(int[] numbers) {
    if (numbers == null || numbers.length < 2) {
      return 0;
    }

    int maxNumber = numbers[0];
    int minNumber = numbers[0];
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > maxNumber) {
        maxNumber = numbers[i];
      }
      if (numbers[i] < minNumber) {
        minNumber = numbers[i];
      }
      sum += numbers[i];
    }

    return sum - minNumber - maxNumber;
  }
}