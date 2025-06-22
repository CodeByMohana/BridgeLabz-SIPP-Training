import java.util.Scanner;

public class RecursiveFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = getInput(scanner);
        long result = factorial(num);
        displayResult(num, result);
        scanner.close();
    }

    public static int getInput(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void displayResult(int n, long fact) {
        System.out.println("Factorial of " + n + " is " + fact);
    }
}