public class CtoFTester {
  public static void main(String[] args) {
    System.out.println(celciusToFahrenheit(100));
    System.out.println(fahrenheitToCelcius(100));
  }
  static double celciusToFahrenheit(double dCelc) {
    return dCelc * (9.0 / 5) + 32;
  }
  static double fahrenheitToCelcius(double dFahr) {
    return (dFahr - 32) * (5.0 / 9);
  }
}
