// https://www.codewars.com/kata/5aff237c578a14752d0035ae
import java.util.stream.IntStream;

public class PredictAge {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int sum = IntStream.of(age1*age1, age2*age2, age3*age3, age4*age4, age5*age5, age6*age6, age7*age7, age8*age8).sum();
        return (int) Math.floor(Math.sqrt(sum) / 2);
    }
}