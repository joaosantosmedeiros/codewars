// https://www.codewars.com/kata/5648b12ce68d9daa6b000099 
import java.util.ArrayList;

class Metro {
  public static int countPassengers(ArrayList<int[]> stops) {
    var passengers = stops.stream().reduce((a, b) -> new int[]{a[0] + b[0], a[1] + b[1]}).get();
    return passengers[0] - passengers[1];
  }
}