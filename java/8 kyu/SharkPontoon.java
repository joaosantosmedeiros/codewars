// https://www.codewars.com/kata/57e921d8b36340f1fd000059
public class SharkPontoon {
  public static String shark(int pontoonDistance, int sharkDistance, int youSpeed, int sharkSpeed, boolean dolphin) {
    if (youSpeed == 0) {
      return "Shark Bait!";
    }
    if (dolphin) {
      sharkSpeed = sharkSpeed / 2;
    }
    if (sharkSpeed == 0) {
      return "Alive!";
    }

    double youTime = pontoonDistance / youSpeed;
    double sharkTime = sharkDistance / sharkSpeed;

    return (youTime > sharkTime || sharkDistance < pontoonDistance) ? "Shark Bait!" : "Alive!";
  }
}