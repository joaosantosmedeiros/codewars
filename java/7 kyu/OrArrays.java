// https://www.codewars.com/kata/5ac5e9aa3853da25d9000102
public class OrArrays {

  public static int[] orArrays(int[] arr1, int[] arr2) {
    return orArrays(arr1, arr2, 0);
  }

  public static int[] orArrays(int[] arr1, int[] arr2, int number) {
    while (arr1.length < arr2.length) {
      int[] aux = arr1;
      arr1 = new int[arr1.length + 1];
      for (int i = 0; i < arr1.length; i++) {
        if (i < aux.length) {
          arr1[i] = aux[i];
        } else {
          arr1[i] = number;
        }
      }
    }
    while (arr2.length < arr1.length) {
      int[] aux = arr2;
      arr2 = new int[arr2.length + 1];
      for (int i = 0; i < arr2.length; i++) {
        if (i < aux.length) {
          arr2[i] = aux[i];
        } else {
          arr2[i] = number;
        }
      }
    }

    int[] newArr = new int[arr1.length];
    for (int i = 0; i < arr2.length; i++) {
      if (arr1[i] == arr2[i]) {
        newArr[i] = arr1[i];
      } else {
        newArr[i] = arr1[i] | arr2[i];
      }
    }

    return newArr;
  }
}