import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (dd-MM-yyyy): ");
        String input = sc.nextLine();

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


        LocalDate date = LocalDate.parse(input,inputFormatter);
        LocalDate result = date
            .plusDays(7)
            .plusMonths(1)
            .plusYears(2)
            .minusWeeks(3);
        System.out.println("Final date after operations: " + result.format(inputFormatter));

    }
}
