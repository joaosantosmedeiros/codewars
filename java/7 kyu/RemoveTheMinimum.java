// https://www.codewars.com/kata/563cf89eb4747c5fb100001b
public class RemoveTheMinimum {

  public static int[] removeSmallest(int[] numbers) {
    if (numbers.length < 1) {
      return new int[] {};
    }

    int[] numbersFiltered = new int[numbers.length - 1];
    int minValue = numbers[0];
    int minIndex = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < minValue) {
        minValue = numbers[i];
        minIndex = i;
      }
    }

    for (int i = 0; i < numbers.length - 1; i++) {
      if (i >= minIndex) {
        numbersFiltered[i] = numbers[i + 1];
      } else {
        numbersFiltered[i] = numbers[i];
      }
    }

    return numbersFiltered;
  }
}
