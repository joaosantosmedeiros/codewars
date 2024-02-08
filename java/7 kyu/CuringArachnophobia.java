// https://www.codewars.com/kata/5bc73331797b005d18000255/train/java
public class CuringArachnophobia {
  public static String drawSpider(int legSize, int bodySize, char mouth, char eye) {
    StringBuilder spider = new StringBuilder("");
    StringBuilder leg = new StringBuilder("");

    if (legSize == 1) {
      leg.append("^");
    } else if (legSize == 2) {
      leg.append("/\\");
    } else if (legSize == 3) {
      leg.append("/╲");
    } else {
      leg.append("╱╲");
    }

    StringBuilder secondLeg = legSize == 3 ? new StringBuilder("╱\\") : leg;

    int numberOfEyes = bodySize > 1 ? (int) Math.floor(Math.pow(bodySize, 2) / 2) : 1;

    spider.append(leg);
    spider.append("(".repeat(bodySize));
    spider.append(String.valueOf(eye).repeat(numberOfEyes));
    spider.append(mouth);
    spider.append(String.valueOf(eye).repeat(numberOfEyes));
    spider.append(")".repeat(bodySize));
    spider.append(secondLeg);

    return spider.toString();
  }
}