import java.util.Scanner;

public class question_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the fee: ");
        int fee = input.nextInt();

        System.out.print("Enter the discount percentage: ");
        int discount_percent = input.nextInt();

        int discount = (fee * discount_percent) / 100;
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + (fee - discount));
    }
}

