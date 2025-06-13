import java.util.Scanner;

public class question_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;

        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f%n",
                          distanceInYards, distanceInMiles);
    }
}

