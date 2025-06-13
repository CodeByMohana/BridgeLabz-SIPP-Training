
import java.util.Scanner;

public class question_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the salary (INR): ");
        double salary = input.nextDouble();

        System.out.print("Enter the bonus (INR): ");
        double bonus = input.nextDouble();

        double totalIncome = salary + bonus;

        System.out.printf("The salary is INR %.2f and the bonus is INR %.2f. Hence Total Income is INR %.2f%n",
                          salary, bonus, totalIncome);
    }
}