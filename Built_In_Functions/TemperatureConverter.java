import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (choice == 1) {
            double result = celsiusToFahrenheit(temp);
            System.out.println(temp + "°C = " + result + "°F");
        } else if (choice == 2) {
            double result = fahrenheitToCelsius(temp);
            System.out.println(temp + "°F = " + result + "°C");
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}