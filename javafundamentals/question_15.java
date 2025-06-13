import java.util.Scanner;

public class question_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1 & 2: Declare and input double values
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Step 3: Perform operations
        double result1 = a + b * c;       
        double result2 = a * b + c;
        double result3 = c + a / b;       
        double result4 = a % b + c;       

        // Step 4: Output results
        System.out.println("The results of Double Operations are:");
        System.out.printf("a + b * c = %.2f\n", result1);
        System.out.printf("a * b + c = %.2f\n", result2);
        System.out.printf("c + a / b = %.2f\n", result3);
        System.out.printf("a %% b + c = %.2f\n", result4);
    }
}

