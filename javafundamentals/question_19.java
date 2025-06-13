import java.util.Scanner;
public class question_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Input values
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Step 2: Check for valid division
        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among 0 children.");
        } else {
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            // Step 3: Output
            System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                               " and the number of remaining chocolates is " + remainingChocolates);
        }
    }
}
