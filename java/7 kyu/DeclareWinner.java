// https://www.codewars.com/kata/577bd8d4ae2807c64b00045b
public class DeclareWinner {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    double f1 = fighter1.health / (double) fighter2.damagePerAttack;
    double f2 = fighter2.health / (double) fighter1.damagePerAttack;

    return Math.ceil(f1) == Math.ceil(f2) ? firstAttacker : f1 < f2 ? fighter2.name : fighter1.name;
  }
}

class Fighter {
  public String name;
  public int health, damagePerAttack;
  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }
}