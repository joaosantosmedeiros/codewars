// https://www.codewars.com/kata/53f1015fa9fe02cbda00111a
public class Ghost {
  String getColor() {
    int n = (int) (Math.random() * 10) + 1;
    if (n % 2 == 0) {
      return "red";
    }
    if (n % 3 == 0) {
      return "purple";
    }
    if (n % 5 == 0) {
      return "yellow";
    }
    return "white";
  }
}