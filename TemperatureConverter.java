import java.util.Scanner;

public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the Temperature Converter!");
            System.out.println("Convert Celsius to Fahrenheit and Fahrenheit to Celsius");
            System.out.println("Enter '1' for Celsius to Fahrenheit conversion or '2' for Fahrenheit to Celsius conversion: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter the temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = converter.celsiusToFahrenheit(celsius);
                System.out.println("The temperature in Fahrenheit is: " + fahrenheit + " F");
            } else if (choice == 2) {
                System.out.println("Enter the temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = converter.fahrenheitToCelsius(fahrenheit);
                System.out.println("The temperature in Celsius is: " + celsius + " C");
            } else {
                System.out.println("Invalid choice. Please enter '1' or '2'.");
            }
        } while (choice != 1 && choice != 2);

        scanner.close();
    }
}