import java.util.Scanner;

public class question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;
        while (num != 1) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial of a entered number: " + fact );

    }
}
