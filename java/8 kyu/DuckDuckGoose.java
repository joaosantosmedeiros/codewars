// https://codewars.com/kata/582e0e592029ea10530009ce/
public class DuckDuckGoose {
  public static String duckDuckGoose(Player[] players, int goose) {
    int index = goose % players.length - 1;
    return index == 0 ? players[players.length - 1].name : players[index].name;
  }

}

class Player {
  String name;

  public Player(String name) {
    this.name = name;
  }
}