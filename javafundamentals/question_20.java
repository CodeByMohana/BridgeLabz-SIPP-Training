import java.util.Scanner;
public class question_20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.printf("The %.2f Fahrenheit is %.2f Celsius%n", fahrenheit, celsiusResult);
    }
}