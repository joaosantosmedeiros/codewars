public class ILoveYouALittle {
  public static String howMuchILoveYou(int nb_petals) {
    String[] phrases = {
        "I love you",
        "a little",
        "a lot",
        "passionately",
        "madly",
        "not at all"
    };

    int index = nb_petals % phrases.length == 0 ? 5 : nb_petals % phrases.length - 1;

    return phrases[index];
  }
}