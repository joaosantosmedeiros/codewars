// https://www.codewars.com/kata/57a429e253ba3381850000fb
public class IMC {
  public static String bmi(double weight, double height) {
    double bmi = weight / (height * height);
    return bmi <= 18.5 ? "Underweight" : bmi <= 25 ? "Normal" : bmi <= 30.0 ? "Overweight" : "Obese";
  }
}