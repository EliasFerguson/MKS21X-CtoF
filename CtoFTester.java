public class CtoFTester {
  public double celciusToFahrenheit(double dCelc) {
    return dCelc * (9.0 / 5);
  }
  public double fahrenheitToCelcius(double dFahr) {
    return (dFahr - 32) * (5.0 / 9);
  }
}
System.out.println(celciusToFahrenheit(100))
System.out.println(fahrenheitToCelcius(100))
