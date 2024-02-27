// https://www.codewars.com/kata/55d277882e139d0b6000005d
import java.util.stream.IntStream;

public class GrassHopper2 {

    public static int findAverage(int[] nums) {
        return (int) IntStream.of(nums).average().orElse(0);
    }

    // HARDCORE
    // public static int findAverage(int[] nums) {
    //     int sum = 0;
    //     for(int i = 0; i < nums.length; i ++) {
    //         sum += nums[i];
    //     }
    //     return sum / nums.length;
    // }
}