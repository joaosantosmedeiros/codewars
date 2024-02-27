// https://www.codewars.com/kata/5bb904724c47249b10000131
public class TotalPoints {

  public static int points(String[] games) {
    int sum = 0;
    for (int i = 0; i < games.length; i++) {
      int teamScore = Integer.parseInt(games[i].split(":")[0]);
      int opponentScore = Integer.parseInt(games[i].split(":")[1]);

      sum += teamScore > opponentScore ? 3 : teamScore < opponentScore ? 0 : 1;
    }
    return sum;
  }
}