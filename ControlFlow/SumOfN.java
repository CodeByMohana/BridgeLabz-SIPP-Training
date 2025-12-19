import java.util.Scanner;
public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum1 = (number * (number + 1)) / 2;
        int sum2 = 0;
        while(number != 0){
            sum2 += number;
            number--;
        }
        System.out.println("Sum using formulae "+ sum1 + " using while loop " + sum2);
    }
}
