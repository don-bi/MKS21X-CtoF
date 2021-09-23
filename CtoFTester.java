public class CtoF{
  public static void main(String[] args){
    System.out.println("celsiusToFahrenheit test:");
    System.out.println(celsiusToFahrenheit(50.0));
    System.out.println("fahrenheitToCelsius test:");
    System.out.println(fahrenheitToCelsius(32.0));
  }

  public static double celsiusToFahrenheit(double celsius){
    double fahrenheit = celsius * (9.0 / 5.0) + 32.0;
    return fahrenheit;
  }

  public static double fahrenheitToCelsius(double fahrenheit){
    double celsius = (fahrenheit - 32.0) * (5.0 / 9.0);
    return celsius;
  }
}
