import java.util.Scanner;

public class question_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of side1 in meters: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side2 in meters: ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of side3 in meters: ");
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;

        double rounds = 5000 / perimeter;

        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.%n", rounds);
    }
}