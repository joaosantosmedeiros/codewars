// https://www.codewars.com/kata/58845a92bd573378f4000035/train/java

public class SwapAdjacentBits {
  
  public static int swapAdjacentBits(int n) {
    String binaryNumber = Integer.toBinaryString(n);
    binaryNumber = binaryNumber.length() % 2 != 0 ? "0" + binaryNumber : binaryNumber;
    
    String[] bits = binaryNumber.split("");
    for(int i = 0; i < bits.length - 1; i += 2) {
      var actualBit = bits[i];
      bits[i] = bits[i + 1];
      bits[i + 1] = actualBit;
    }
    
    return Integer.parseInt(String.join("", bits), 2);
  }
}