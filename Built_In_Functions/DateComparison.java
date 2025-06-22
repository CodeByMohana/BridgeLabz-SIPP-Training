import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first date (dd-mm-yyyy): ");
        String input1 = sc.nextLine();
        System.out.print("Enter the second date (dd-mm-yyyy): ");
        String input2 = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(input1, formatter);
        LocalDate date2 = LocalDate.parse(input2, formatter);

        if(date1.isBefore(date2)){
            System.out.println("The first date is before second date");
        }else if(date1.isAfter(date2)){
            System.out.println("The first date is after second date");
        }else{
            System.out.println("Both dates are the same");
        }
    }
}
