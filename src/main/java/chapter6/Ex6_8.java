package Chapter6;

public class Ex6_8 {
    public static void main(String[] args) {
        System.out.printf("%20s %20s %10s %20s %20s%n", "Celsius", "Fahrenheit","|","Fahrenheit", "Celsius");
        for (double c = 40.0D, f = 104.0D; c>=31.0D && f>=87.8D; c--,f -= 1.8) {
            System.out.printf("%20.2f %20.2f %10s %20.2f %20.2f%n",c , f,"|",celsiusToFahrenheit(c),fahrenheitToCelsius(f));
        }
        }

    public static double celsiusToFahrenheit(double celsius) {
        return  (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
