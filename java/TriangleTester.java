// https://www.codewars.com/kata/56606694ec01347ce800001b/train/java
class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    if(a > Math.abs(b - c) && a < (b + c)){
      return true;
    }
    if(b > Math.abs(a - c) && b < (a + c)){
      return true;
    }
    if(c > Math.abs(a - b) && c < (a + b)){
      return true;
    }

    return false;
  }
}