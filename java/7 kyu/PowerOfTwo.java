// https://www.codewars.com/kata/534d0a229345375d520006a0
public class PowerOfTwo {
	public static boolean isPowerOfTwo(long n) {
		int num = 0;
		while(num < Math.sqrt(n)){
			if(Math.pow(2, num) == n){
				return true;
			}
		}
		return false;
	}
}