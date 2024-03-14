public class HelpFellow {
  public static String getHonorPath(int honorScore, int targetHonorScore) {
    int difference = targetHonorScore - honorScore;
    if (difference <= 0) {
      return "";
    }

    int oneKyu = difference % 2;
    int twoKyu = difference / 2;

    return String.format("2kyus: %d, 1kyus: %d", oneKyu, twoKyu);
  }
}