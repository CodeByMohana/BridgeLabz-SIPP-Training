import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGameRandom {
    public static int generateRandomGuess(int low, int high, Random random){
        return random.nextInt(high - low + 1) + low;
    }
    public static String getUserFeedback(Scanner scanner){
        System.out.print("Your feedback (high/low/correct): ");
        return scanner.nextLine().trim().toLowerCase();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int low = 1;
        int high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("The computer will try to guess it.");
        System.out.println("After each guess, type:");
        System.out.println("'high' if the guess is too high");
        System.out.println("'low' if the guess is too low");
        System.out.println("'correct' if the guess is right");

        while(!found && low <= high){
            int guess = generateRandomGuess(low, high, random);
            System.out.println("Computer guesses: " + guess);
            String feedback = getUserFeedback(scanner);

            switch (feedback) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("Yay! The computer guessed your number: " + guess);
                    found = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
                    break;
            }
            if(!found){
                System.out.println("The range became invalid. Did you give the correct hints?");
            }
        }
        scanner.close();

       
    }
}
