// https://www.codewars.com/kata/65127302a5de2b11c940973d
public class SwapCards{
  public static boolean swapCards(int n1, int n2) {
    int aux = n1;
    if(n1 % 10 < n1 / 10){
      n1 = n1/10*10 + n2/10;
      n2 = n2 % 10 + (aux % 10) * 10;
    }else{
      n1 = n2/10*10 + n1%10;
      n2 = n2 % 10 + aux/10*10;
    }
    return n1 > n2;
  }
}