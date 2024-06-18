import java.util.List;
import java.util.stream.LongStream;

public class CodeWars {
  public static long overTheRoad(long address, long n) {
    if(address % 2 == 0) return (n * 2 / address) - 1 + (n * 2 / address);
    return 0;
  }
}

//  n = 6
//  0, 1, 2

//  5, 3, 1
//  2, 4, 6

// 6 / 2 = 3 - 1

// 1|   |6
// 3|   |4
// 5|   |2
//   you