// https://www.codewars.com/kata/5b609ebc8f47bd595e000627
public class FindTheForce {

  public static double solution(double[] arrVal, String[] arrUnit) {
    final double G = 6.67e-11;

    for (int i = 0; i < 2; i++) {
      switch (arrUnit[i].toLowerCase()) {
        case "g":
          arrVal[i] = arrVal[i] * 0.001;
          break;
        case "mg":
          arrVal[i] = arrVal[i] * 1e-6;
          break;
        case "μg":
          arrVal[i] = arrVal[i] * 1e-9;
          break;
        case "lb":
          arrVal[i] = arrVal[i] * 0.453592;
          break;
      }
    }

    switch (arrUnit[2].toLowerCase()) {
      case "cm":
        arrVal[2] = arrVal[2] * 0.01;
        break;
      case "mm":
        arrVal[2] = arrVal[2] * 0.001;
        break;
      case "μm":
        arrVal[2] = arrVal[2] * 1e-6;
        break;
      case "ft":
        arrVal[2] = arrVal[2] * 0.3048;
        break;
    }

    arrVal[2] *= arrVal[2];

    return G * ((arrVal[0] * arrVal[1]) / arrVal[2]);
  }
}
