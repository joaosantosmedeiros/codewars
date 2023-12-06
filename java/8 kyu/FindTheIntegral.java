// https://www.codewars.com/kata/59811fd8a070625d4c000013/train/java
public class FindTheIntegral {
    public static String integrate(int coefficient, int exponent) {
        int newExponent = exponent + 1;
        int newCoefficient = coefficient / newExponent;
        return newCoefficient + "x^" + newExponent;
    }
}