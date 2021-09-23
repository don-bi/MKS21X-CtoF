//The functions should have the unit they are converting as parameters, with celsius for celsiusToFahrenheit
//and fahrenheit for fahrenheitToCelsius.
//The functions should return the other unit celsius/fahrenheit that the arguments would be converted to.

public class CtoFTester{
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
