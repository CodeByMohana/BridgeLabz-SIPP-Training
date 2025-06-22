import java.util.Scanner;

public class  GCDLCMCalculator5{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = getInput(scanner, "Enter first number: ");
        int b = getInput(scanner, "Enter second number: ");

        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b, gcd);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        scanner.close();
    }

    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}