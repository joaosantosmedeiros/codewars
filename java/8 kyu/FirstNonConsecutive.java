// https://www.codewars.com/kata/58f8a3a27a5c28d92e000144
class FirstNonConsecutive {
  static Integer find(final int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i + 1] != array[i] + 1) {
        return array[i + 1];
      }
    }
    return null;
  }
}
